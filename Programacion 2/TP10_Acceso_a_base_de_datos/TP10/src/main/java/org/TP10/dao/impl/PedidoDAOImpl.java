package org.TP10.dao.impl;

import org.TP10.dao.PedidoDAO;
import org.TP10.domain.Pedido;

import java.sql.*;

public class PedidoDAOImpl implements PedidoDAO {
    @Override
    public void guardar(Pedido pedido, Connection conn) throws SQLException {
        String sql = "INSERT INTO pedidos (total) VALUES (?)";
        // NO usamos try-with-resources para la conexión, nos la da el Service
        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setDouble(1, pedido.getTotal());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    pedido.setId(rs.getInt(1));
                }
            }
        }
    }
}
