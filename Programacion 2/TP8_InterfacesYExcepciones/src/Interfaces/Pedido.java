package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private EstadoPedido estado;
    private Notificable cliente;

    public Pedido(List<Producto> productos, Notificable cliente) {
        this.productos = new ArrayList<>(productos);
        this.estado = EstadoPedido.PENDIENTE;
        this.cliente = cliente;
        notificarCambioEstado();
    }

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
        this.cliente = cliente;
        notificarCambioEstado();
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return Collections.unmodifiableList(productos);
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        notificarCambioEstado();
    }

    private void notificarCambioEstado() {
        if (cliente != null) {
            cliente.notificar("El estado del pedido ha cambiado a: " + this.estado);
        }
    }
}
