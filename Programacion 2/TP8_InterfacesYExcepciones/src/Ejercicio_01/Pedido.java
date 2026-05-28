package Ejercicio_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {
    private List<Producto> pedidos;

    public Pedido(List<Producto> pedidos) {
        this.pedidos =new ArrayList<>();
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto p : pedidos){
            total += p.calcularTotal();
        }
        return  total;
    }

    public void agregarProducto(Producto p){
        pedidos.add(p);
    }

    public List<Producto> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }
}
