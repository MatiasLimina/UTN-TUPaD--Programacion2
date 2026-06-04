import java.util.Collections;

public class Carrito <T extends Producto<?>>{
    private java.util.List<T> productos;
    private double total;

    public Carrito() {
        this.productos = new java.util.ArrayList<>();
        this.total = calcularTotal();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
        this.total = calcularTotal();
    }

    public void eliminarProducto(T producto) {
        productos.remove(producto);
        this.total = calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public double calcularTotal() {
        double total = 0;
        for (T producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarCarrito() {
        this.total = calcularTotal();
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (T producto : productos) {
                System.out.println(producto.toString());
            }
            System.out.println("Total: " + total);
        }
    }

    public java.util.List<T> getProductos() {
        return Collections.unmodifiableList(productos);
    }

}
