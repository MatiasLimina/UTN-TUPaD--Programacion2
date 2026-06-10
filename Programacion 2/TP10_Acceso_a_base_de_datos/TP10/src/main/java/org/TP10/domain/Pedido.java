package org.TP10.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer id;
    private Date fecha;
    private double total;
    private List<ItemPedido> items = new ArrayList<>(); // Un pedido tiene muchos ítems

    public Pedido() {
        this.fecha = new Date();
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemPedido item = new ItemPedido(producto, cantidad);
        this.items.add(item);
        this.total += item.getSubtotal(); // Va sumando al total del pedido automáticamente
    }

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public List<ItemPedido> getItems() { return items; }
    public void setItems(List<ItemPedido> items) { this.items = items; }
}
