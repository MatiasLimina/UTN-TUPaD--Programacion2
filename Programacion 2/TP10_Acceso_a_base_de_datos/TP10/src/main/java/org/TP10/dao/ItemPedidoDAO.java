package org.TP10.dao;

import org.TP10.domain.ItemPedido;

import java.sql.Connection;
import java.sql.SQLException;

public interface ItemPedidoDAO {
    void guardar(ItemPedido item, int pedidoId, Connection conn) throws SQLException;
}
