package org.TP10.service;

import org.TP10.domain.Pedido;

public interface PedidoService {
    void crearPedido(Pedido pedido);
    void mostrarDetallePedido(int pedidoId);
}

