import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto<Integer> p1 = new Producto<>("Manzana",20,102);
        Producto<Integer> p2 = new Producto<>("Cebolla",5,100);
        Producto<Integer> p3 = new Producto<>("Pera",67,157);

        Carrito<Producto<Integer>> c1 = new Carrito<>();

        c1.agregarProducto(p1);
        c1.agregarProducto(p2);
        c1.agregarProducto(p3);

        c1.mostrarCarrito();

        c1.eliminarProducto(p3);

        c1.mostrarCarrito();

        Carrito<Producto<Integer>> c2 = new Carrito<>();
        Carrito<Producto<Integer>> c3 = new Carrito<>();

        c2.agregarProducto(p1);

        c3.agregarProducto(p2);
        c3.agregarProducto(p3);

        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(new Pedido(c1));
        listaPedidos.add(new Pedido(c2));
        listaPedidos.add(new Pedido(c3));

        System.out.println("=== 1. PEDIDOS ORDENADOS POR TOTAL (Comparable) ===");

        // Al pasarle solo la lista, Collections.sort() usa el compareTo() de Pedido
        Collections.sort(listaPedidos);

        for (Pedido p : listaPedidos) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("=== 2. PEDIDOS REORDENADOS POR FECHA (Comparator) ===");

        // Le pasamos la clase externa que creaste para comparar fechas
        Collections.sort(listaPedidos, new ComparadorPedidoPorFecha());

        for (Pedido p : listaPedidos) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("=== 3. PRUEBA DEL BUSCADOR GENÉRICO ===");

        // Instanciamos el buscador limitándolo a <Pedido, Integer>
        Buscador<Pedido, Integer> buscador = new Buscador<>();

        // Caso A: Buscamos un ID que SÍ existe (por ejemplo, el ID: 2)
        Integer idExistente = 2;
        System.out.println("Buscando pedido con ID " + idExistente + "...");
        Pedido encontrado = buscador.buscarPorId(listaPedidos, idExistente);

        if (encontrado != null) {
            System.out.println("Resultado: Elemento encontrado -> " + encontrado);
        } else {
            System.out.println("Resultado: El elemento con ID " + idExistente + " no existe.");
        }
        System.out.println();

        // Caso B: Buscamos un ID que NO existe (por ejemplo, el ID: 99)
        Integer idInexistente = 99;
        System.out.println("Buscando pedido con ID " + idInexistente + "...");
        Pedido noEncontrado = buscador.buscarPorId(listaPedidos, idInexistente);

        if (noEncontrado != null) {
            System.out.println("Resultado: Elemento encontrado -> " + noEncontrado);
        } else {
            System.out.println("Resultado: El elemento con ID " + idInexistente + " no existe.");
        }
    }
}