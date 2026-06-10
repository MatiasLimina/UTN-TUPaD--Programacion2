package org.TP10.dao;

import org.TP10.domain.Producto;

import java.util.List;

public interface ProductoDAO extends GenericDAO<Producto>{
    List<Producto> listarPorCategoria(int idCategoria);
    boolean existeCategoria(int idCategoria);
}
