package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> listaProductos;
    private double total;

    public Pedido(List<Producto> productosIniciales) {
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
        this.listaProductos = new ArrayList<>();
        this.listaProductos.add(primerProducto);
        calcularTotal();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(List<Producto> listaProductos) {
        if (listaProductos == null || listaProductos.isEmpty()){
            System.out.println("ERROR: la lista de productos no puede estar vacia");
        }else{
            this.listaProductos = listaProductos;
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
    @Override
    public String toString() {
        return "Pedido{" +
                "listaProductos=" + listaProductos +
                ", total=" + total +
                '}';
    }
}
