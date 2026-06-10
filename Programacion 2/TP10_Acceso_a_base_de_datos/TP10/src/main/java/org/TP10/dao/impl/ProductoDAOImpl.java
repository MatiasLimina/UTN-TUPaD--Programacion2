package org.TP10.dao.impl;

import org.TP10.config.DatabaseConnection;
import org.TP10.dao.ProductoDAO;
import org.TP10.domain.Categoria;
import org.TP10.domain.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {
    private Connection getConnection() throws SQLException {
        return DatabaseConnection.getConnection();
    }

    @Override
    public void crear(Producto producto) {
        String sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad, id_categoria) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescription());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setInt(5, producto.getCategoria().getId()); // Sacamos el ID del objeto Categoria mapeado
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    producto.setId(rs.getInt(1));
                }
            }
            System.out.println("Producto creado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al crear producto", e);
        }
    }

    @Override
    public Producto leer(int id) {
        // Usamos un INNER JOIN para armar el objeto Categoria entero en el mapeo
        String sql = "SELECT p.*, c.nombre AS cat_nombre, c.descripcion AS cat_desc " +
                "FROM productos p " +
                "INNER JOIN categorias c ON p.id_categoria = c.id " +
                "WHERE p.id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearProducto(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al leer producto", e);
        }
        return null;
    }

    @Override
    public void actualizar(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, cantidad = ?, id_categoria = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescription());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setInt(5, producto.getCategoria().getId());
            ps.setInt(6, producto.getId());

            ps.executeUpdate();
            System.out.println("Producto actualizado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al actualizar producto", e);
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Producto eliminado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al eliminar producto", e);
        }
    }

    @Override
    public List<Producto> listar() {
        String sql = "SELECT p.*, c.nombre AS cat_nombre, c.descripcion AS cat_desc " +
                "FROM productos p " +
                "INNER JOIN categorias c ON p.id_categoria = c.id";
        List<Producto> lista = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearProducto(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al listar productos", e);
        }
        return lista;
    }

    @Override
    public List<Producto> listarPorCategoria(int idCategoria) {
        String sql = "SELECT p.*, c.nombre AS cat_nombre, c.descripcion AS cat_desc " +
                "FROM productos p " +
                "INNER JOIN categorias c ON p.id_categoria = c.id " +
                "WHERE p.id_categoria = ?";
        List<Producto> lista = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idCategoria);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapearProducto(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al listar productos por categoría", e);
        }
        return lista;
    }

    @Override
    public boolean existeCategoria(int idCategoria) {
        String sql = "SELECT COUNT(*) FROM categorias WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idCategoria);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al verificar existencia de la categoría", e);
        }
        return false;
    }

    // Método helper privado para no repetir código de mapeo de objetos (Buenas prácticas de la UTN)
    private Producto mapearProducto(ResultSet rs) throws SQLException {
        Categoria cat = new Categoria();
        cat.setId(rs.getInt("id_categoria"));
        cat.setNombre(rs.getString("cat_nombre"));
        cat.setDescripcion(rs.getString("cat_desc"));

        Producto prod = new Producto();
        prod.setId(rs.getInt("id"));
        prod.setNombre(rs.getString("nombre"));
        prod.setDescripcion(rs.getString("descripcion"));
        prod.setPrecio(rs.getDouble("precio"));
        prod.setCantidad(rs.getInt("cantidad"));
        prod.setCategoria(cat); // Le inyectamos la categoría completa al producto

        return prod;
}
}
