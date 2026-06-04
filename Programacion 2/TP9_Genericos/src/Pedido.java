import java.time.LocalDate;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {
    private Integer id;
    private LocalDate fecha;
    private Carrito<?> carrito;
    private double total;
    private static int contador = 0;


    public Pedido( Carrito<? extends Producto> carrito) {
        this.id = contador++;
        this.fecha = LocalDate.now();
        this.carrito = carrito;
        this.total = carrito.calcularTotal();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Carrito<?> getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito<?> carrito) {
        this.carrito = carrito;
    }

    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Pedido otroPedido) {
        return Double.compare(this.total, otroPedido.total);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
}
