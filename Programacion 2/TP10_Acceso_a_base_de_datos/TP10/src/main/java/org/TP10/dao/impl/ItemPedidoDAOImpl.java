package org.TP10.dao.impl;

import org.TP10.dao.ItemPedidoDAO;
import org.TP10.domain.ItemPedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemPedidoDAOImpl implements ItemPedidoDAO {
    @Override
    public void guardar(ItemPedido item, int pedidoId, Connection conn) throws SQLException {
        String sql = "INSERT INTO items_pedido (pedido_id, producto_id, cantidad, subtotal) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pedidoId);
            ps.setInt(2, item.getProducto().getId());
            ps.setInt(3, item.getCantidad());
            ps.setDouble(4, item.getSubtotal());
            ps.executeUpdate();
        }
    }
}
