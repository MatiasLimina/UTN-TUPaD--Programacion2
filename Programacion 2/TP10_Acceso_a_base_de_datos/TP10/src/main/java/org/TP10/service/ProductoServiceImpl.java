package org.TP10.service;

import org.TP10.dao.ProductoDAO;
import org.TP10.dao.impl.ProductoDAOImpl;
import org.TP10.domain.Producto;

import java.util.List;

public class ProductoServiceImpl implements ProductoService{
    private final ProductoDAO productoDAO;

    public ProductoServiceImpl() {
        this.productoDAO = new ProductoDAOImpl();
    }

    @Override
    public void guardar(Producto producto) {
        // 1. Validación: Nombre no vacío (Parte 2)
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }

        // 2. Validación: Precio mayor a 0 (Parte 2)
        if (producto.getPrecio() <= 0) {
            throw new IllegalArgumentException("El precio del producto debe ser mayor a 0.");
        }

        // 3. Validación: Cantidad mayor a 0 (Parte 2)
        if (producto.getCantidad() <= 0) {
            throw new IllegalArgumentException("La cantidad inicial del producto debe ser mayor a 0.");
        }

        // 4. Validación: Categoría válida y existente (Parte 2)
        if (producto.getCategoria() == null || producto.getCategoria().getId() == null) {
            throw new IllegalArgumentException("El producto debe tener una categoría asignada.");
        }

        if (!productoDAO.existeCategoria(producto.getCategoria().getId())) {
            throw new IllegalArgumentException("La categoría asignada no existe en la base de datos.");
        }

        // Si pasa todo, al DAO a guardarse
        productoDAO.crear(producto);
    }

    @Override
    public Producto obtenerPorId(int id) {
        return productoDAO.leer(id);
    }

    @Override
    public void modificar(Producto producto) {
        // Al modificar también validamos consistencia básica
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío al modificar.");
        }
        if (producto.getPrecio() <= 0 || producto.getCantidad() < 0) {
            throw new IllegalArgumentException("El precio debe ser > 0 y el stock no puede ser negativo.");
        }
        productoDAO.actualizar(producto);
    }

    @Override
    public void borrar(int id) {
        productoDAO.eliminar(id);
    }

    @Override
    public List<Producto> obtenerTodos() {
        return productoDAO.listar();
    }

    @Override
    public List<Producto> obtenerPorCategoria(int idCategoria) {
        return productoDAO.listarPorCategoria(idCategoria);
    }
}
