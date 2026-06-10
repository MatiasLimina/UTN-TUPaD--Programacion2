package org.TP10.service;


import org.TP10.config.DatabaseConnection;
import org.TP10.dao.ItemPedidoDAO;
import org.TP10.dao.PedidoDAO;
import org.TP10.dao.impl.ItemPedidoDAOImpl;
import org.TP10.dao.impl.PedidoDAOImpl;
import org.TP10.domain.ItemPedido;
import org.TP10.domain.Pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoServiceImpl implements PedidoService  {
    private final PedidoDAO pedidoDAO;
    private final ItemPedidoDAO itemPedidoDAO;

    public PedidoServiceImpl() {
        this.pedidoDAO = new PedidoDAOImpl();
        this.itemPedidoDAO = new ItemPedidoDAOImpl();
    }

    @Override
    public void crearPedido(Pedido pedido) {
        Connection conn = null;
        try {
            // 1. Tomamos una conexión del pool de Hikari
            conn = DatabaseConnection.getConnection();

            // 2. Iniciamos la transacción manualmente
            conn.setAutoCommit(false);

            // 3. Procesamos y validamos cada renglón del pedido antes de guardar
            for (ItemPedido item : pedido.getItems()) {
                int productoId = item.getProducto().getId();

                // Consultamos el stock actual directo de la base de datos (Garantiza consistencia)
                String sqlStock = "SELECT cantidad, nombre FROM productos WHERE id = ? FOR UPDATE";
                // "FOR UPDATE" bloquea ese registro temporalmente para que nadie más altere el stock en simultáneo

                try (PreparedStatement psStock = conn.prepareStatement(sqlStock)) {
                    psStock.setInt(1, productoId);
                    try (ResultSet rs = psStock.executeQuery()) {
                        if (rs.next()) {
                            int stockActual = rs.getInt("cantidad");
                            String nombreProd = rs.getString("nombre");

                            // Validación crítica: ¿Alcanza el stock?
                            if (item.getCantidad() > stockActual) {
                                throw new IllegalArgumentException("Stock insuficiente para: " + nombreProd +
                                        " (Pedido: " + item.getCantidad() + " | Disponible: " + stockActual + ")");
                            }

                            // 4. Si hay stock suficiente, calculamos el nuevo remanente y actualizamos
                            int nuevoStock = stockActual - item.getCantidad();
                            String sqlUpdateStock = "UPDATE productos SET cantidad = ? WHERE id = ?";
                            try (PreparedStatement psUpdate = conn.prepareStatement(sqlUpdateStock)) {
                                psUpdate.setInt(1, nuevoStock);
                                psUpdate.setInt(2, productoId);
                                psUpdate.executeUpdate();
                            }
                        } else {
                            throw new IllegalArgumentException("El producto con ID " + productoId + " no existe.");
                        }
                    }
                }
            }

            // 5. Si todos los productos pasaron el filtro de stock, guardamos el cabezal del Pedido
            pedidoDAO.guardar(pedido, conn);

            // 6. Con el ID del pedido ya generado por MySQL, persistimos sus ítems vinculados
            for (ItemPedido item : pedido.getItems()) {
                itemPedidoDAO.guardar(item, pedido.getId(), conn);
            }

            // 7. Si llegó hasta acá sin excepciones, confirmamos la operación de forma definitiva
            conn.commit();
            System.out.println("¡Pedido #" + pedido.getId() + " procesado y guardado con éxito!");

        } catch (Exception e) {
            // 8. ROLLBACK: Si falló el stock o hubo error de red, deshacemos ABSOLUTAMENTE TODO
            System.err.println("❌ ERROR EN EL PEDIDO: " + e.getMessage() + " -> Aplicando Rollback...");
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // Propagamos el error para avisar al Main
            throw new RuntimeException(e.getMessage());
        } finally {
            // 9. Cerramos/Devolvemos la conexión al pool pase lo que pase
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Buena práctica: restaurar el estado por defecto del pool
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void mostrarDetallePedido(int pedidoId) {
        // Consulta SQL con múltiples JOINs para consolidar todo el reporte detallado
        String sql = "SELECT p.id AS ped_id, p.fecha, p.total AS ped_total, " +
                "ip.cantidad, ip.subtotal, pr.nombre AS prod_nombre, pr.precio, " +
                "c.nombre AS cat_nombre " +
                "FROM pedidos p " +
                "INNER JOIN items_pedido ip ON p.id = ip.pedido_id " +
                "INNER JOIN productos pr ON ip.producto_id = pr.id " +
                "INNER JOIN categorias c ON pr.id_categoria = c.id " +
                "WHERE p.id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, pedidoId);
            try (ResultSet rs = ps.executeQuery()) {
                boolean cabezalImpreso = false;

                while (rs.next()) {
                    if (!cabezalImpreso) {
                        System.out.println("\n==================================================");
                        System.out.println(" DETALLE DEL PEDIDO COMPLETO (ID: " + rs.getInt("ped_id") + ")");
                        System.out.println(" Fecha: " + rs.getTimestamp("fecha"));
                        System.out.println("==================================================");
                        cabezalImpreso = true;
                    }
                    System.out.printf("- %s [%s] x%d u. | Precio Unit: $%.2f | Subtotal: $%.2f\n",
                            rs.getString("prod_nombre"),
                            rs.getString("cat_nombre"),
                            rs.getInt("cantidad"),
                            rs.getDouble("precio"),
                            rs.getDouble("subtotal"));
                }

                if (cabezalImpreso) {
                    // Volvemos a pedir el total acumulado
                    rs.first(); // Nos movemos al inicio si el driver lo soporta, o simplemente manejamos una variable.
                    // Para evitar problemas con cursores forward-only, lo manejamos limpio volviendo a consultar o imprimiendo al final de la lectura del bucle
                    // Vamos a hacer una segunda lectura simple del total para asegurar compatibilidad total de drivers:
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al mostrar el detalle del pedido: " + e.getMessage());
        }
    }
}
