package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 04 - Inventario de productos");
    InventarioProductos producto1 = new InventarioProductos("Libro", 20000);
    System.out.println(producto1.toString());
    producto1.aplicarDescuento(20);
    System.out.println(producto1.toString());
    System.out.println("-----------------------------------");
    InventarioProductos producto2 = new InventarioProductos("Celular");
    System.out.println(producto2.toString());
    producto2.aplicarDescuento(90,20);
    System.out.println(producto2.toString());
    System.out.println("-----------------------------------");
    InventarioProductos producto3 = new InventarioProductos("Computadora", -500);
    System.out.println(producto3.toString());
    System.out.println("Cambio del valor del IVA");
    InventarioProductos.cambiarIVA(0.15);
    System.out.println(producto1.toString());
    System.out.println("-----------------------------------");
    System.out.println(producto2.toString());
    System.out.println("-----------------------------------");
    System.out.println(producto3.toString());




    }
}
