package Ejercicio_06;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Papa",20);
        Producto p2 = new Producto("Manzana",12);
        Producto p3 = new Producto("Pera",50);
        List<Producto> lista1 = new ArrayList<Producto>();
        lista1.add(p1);
        lista1.add(p2);
        lista1.add(p3);
        Pedido pedido1 = new Pedido(lista1);
        System.out.println(pedido1);
        System.out.println("-------------------------");
        Pedido pedido2 = new Pedido(p1);
        System.out.println(pedido2);
        System.out.println("-------------------------");
        List<Producto> lista2 = new ArrayList<Producto>();
        Pedido pedido3 = new Pedido(lista2);
        System.out.println(pedido3);
        System.out.println("-------------------------");
        pedido1.setEstado(EstadoPedido.ENTREGADO);
        System.out.println(pedido1);
        System.out.println("-------------------------");
        pedido1.setEstado(EstadoPedido.CANCELADO);
        System.out.println(pedido1);
    }
}
