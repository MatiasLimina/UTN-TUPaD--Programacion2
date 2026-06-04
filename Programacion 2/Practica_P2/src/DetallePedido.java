import java.time.LocalDateTime;

public class DetallePedido extends Base{
    private int cantidad;
    private double subtotal;
    private Libro libro;

    // TO DO
    // Relacion 1...n Libro


    public DetallePedido(int cantidad, Libro libro) {
        super(false,LocalDateTime.now());
        this.cantidad = cantidad;
        this.libro = libro;
        this.subtotal = calcularSubTotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubTotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
        this.subtotal = calcularSubTotal();
    }

    public double calcularSubTotal(){
        return this.libro.getPrecio() * this.cantidad;
    }
}
