package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> listaProductos;
    private double total;
    private EstadoPedido estado;

    public Pedido(List<Producto> productosIniciales) {
        this.estado = EstadoPedido.PENDIENTE;
        if (productosIniciales == null || productosIniciales.isEmpty()) {
            System.out.println("ERROR: No se puede crear un pedido sin productos.");
            // Opcional: inicializar vacía para evitar nulls,
            // pero el requisito dice que "debe" tener uno.
            this.listaProductos = new ArrayList<>();
        } else {
            this.listaProductos = productosIniciales;
            calcularTotal(); // Calculamos apenas nace el objeto
        }
    }

    public Pedido(Producto primerProducto) {
        this(new ArrayList<>(List.of(primerProducto)));
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(List<Producto> listaProductos) {
        if (listaProductos == null || listaProductos.isEmpty()){
            System.out.println("ERROR: la lista de productos no puede estar vacia");
        }else{
            this.listaProductos = listaProductos;
            calcularTotal();
        }
    }
    public double getTotal() {
        return total;
    }
    private void calcularTotal() {
        double suma = 0;
        for (Producto p : listaProductos) {
            suma += p.getPrecio();
        }
        this.total = suma;
    }
    private void mostrarProductos(){
        for (Producto p : listaProductos) {
            System.out.println(p);
        }

    }

    public void setEstado(EstadoPedido nuevoEstado) {
        // Regla 1: No se puede cambiar nada si ya está ENTREGADO
        if (this.estado == EstadoPedido.ENTREGADO) {
            System.out.println("Error: Un pedido entregado es definitivo.");
            return;
        }

        // Regla 2: No se puede enviar si está CANCELADO
        if (this.estado == EstadoPedido.CANCELADO && nuevoEstado == EstadoPedido.ENVIADO) {
            System.out.println("Error: No se puede enviar un pedido que fue cancelado.");
            return;
        }

        // Si pasa los filtros, se cambia el estado
        this.estado = nuevoEstado;
        System.out.println("Estado actualizado a: " + nuevoEstado);
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "listaProductos=" + listaProductos +
                ", total=" + total + "Estado: "+ estado +
                '}';
    }
}
