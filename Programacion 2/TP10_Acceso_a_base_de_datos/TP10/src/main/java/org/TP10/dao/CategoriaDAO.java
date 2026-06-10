package org.TP10.dao;

import org.TP10.domain.Categoria;

public interface CategoriaDAO extends GenericDAO <Categoria> {
    boolean existeNombre(String nombre);
}
