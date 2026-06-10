package org.TP10.service;

import org.TP10.domain.Categoria;

import java.util.List;

public interface CategoriaService {
    void guardar(Categoria categoria);
    Categoria obtenerPorId(int id);
    void modificar(Categoria categoria);
    void borrar(int id);
    List<Categoria> obtenerTodas();
}
