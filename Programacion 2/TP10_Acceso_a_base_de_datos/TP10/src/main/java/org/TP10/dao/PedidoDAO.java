package org.TP10.dao;

import org.TP10.domain.Pedido;

import java.sql.Connection;
import java.sql.SQLException;

public interface PedidoDAO {
    void guardar(Pedido pedido, Connection conn) throws SQLException;
}
