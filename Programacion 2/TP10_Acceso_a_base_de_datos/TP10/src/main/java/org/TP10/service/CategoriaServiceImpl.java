package org.TP10.service;

import org.TP10.dao.CategoriaDAO;
import org.TP10.dao.impl.CategoriaDaoImpl;
import org.TP10.domain.Categoria;

import java.util.List;

public class CategoriaServiceImpl implements CategoriaService{
    // Acoplamos el Service con el DAO para poder usar sus métodos SQL
    private final CategoriaDAO categoriaDAO;

    public CategoriaServiceImpl() {
        this.categoriaDAO = new CategoriaDaoImpl();
    }

    @Override
    public void guardar(Categoria categoria) {
        // 1. Validación: Nombre no vacío
        if (categoria.getNombre() == null || categoria.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la categoría no puede estar vacío.");
        }

        // 2. Validación: Unicidad del nombre (Uso de existeNombre obligatorio del TP)
        if (categoriaDAO.existeNombre(categoria.getNombre().trim())) {
            throw new IllegalArgumentException("Ya existe una categoría con el nombre: " + categoria.getNombre());
        }

        // Si pasa las validaciones, se persiste en la base de datos
        categoriaDAO.crear(categoria);
    }

    @Override
    public Categoria obtenerPorId(int id) {
        return categoriaDAO.leer(id);
    }

    @Override
    public void modificar(Categoria categoria) {
        // Al modificar también validamos que no quede el nombre vacío
        if (categoria.getNombre() == null || categoria.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la categoría no puede estar vacío al modificar.");
        }
        categoriaDAO.actualizar(categoria);
    }

    @Override
    public void borrar(int id) {
        categoriaDAO.eliminar(id);
    }

    @Override
    public List<Categoria> obtenerTodas() {
        return categoriaDAO.listar();
    }
}
