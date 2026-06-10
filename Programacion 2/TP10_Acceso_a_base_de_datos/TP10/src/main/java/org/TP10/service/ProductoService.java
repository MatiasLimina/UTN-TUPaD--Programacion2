package org.TP10.service;

import org.TP10.domain.Producto;

import java.util.List;

public interface ProductoService {
    void guardar(Producto producto);
    Producto obtenerPorId(int id);
    void modificar(Producto producto);
    void borrar(int id);
    List<Producto> obtenerTodos();
    List<Producto> obtenerPorCategoria(int idCategoria);
}
