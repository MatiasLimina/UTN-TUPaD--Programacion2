import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido extends Base implements Calculable{
    private LocalDate fecha;
    private Estado estado;
    private double total;
    private FormaPago formaPago;
    private List<DetallePedido> detalles;
    private Cliente cliente;

    public Pedido( LocalDate fecha, Estado estado, FormaPago formaPago, Cliente cliente) {
        super(false, LocalDateTime.now());
        this.fecha = fecha;
        this.estado = estado;
        this.formaPago = formaPago;
        this.total = 0;
        this.detalles = new ArrayList<>();
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetallePedido> getDetalles() {
        return Collections.unmodifiableList(detalles);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public void calcularTotal(){
        if (detalles.isEmpty()){
            System.out.println("Lista vacia");
            return;
        }
        this.total = 0; // Se resetea antes de sumar para evitar duplicados
        for (DetallePedido d : detalles){
            this.total += d.getSubtotal();
        }
    }

    public void addDetallePedido(int cantidad, Double precioUnitario, Libro libro){
        DetallePedido detalle = new DetallePedido(cantidad, libro);
        detalles.add(detalle);
    }

    public DetallePedido findDetallePedidoByLibro(Libro libro){
        for(DetallePedido d : detalles){
            if (d.getLibro().equals(libro)){
                return d;
            }
        }
        return null;
    }

    public void deleteDetallePedidoByLibro(Libro libro) {
        // removeIf devuelve true si logró borrar algo, o false si no encontró nada
        boolean eliminado = detalles.removeIf(d -> d.getLibro().equals(libro));
        if (eliminado) {
            System.out.println("Se eliminó el detalle del libro " + libro.getTitulo());
        } else {
            System.out.println("No se encontró el libro");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "fecha=" + fecha +
                ", estado=" + estado +
                ", total=" + total +
                ", formaPago=" + formaPago +
                ", detalles=" + detalles +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "Sin cliente") +
                ", " + super.toString() +
                '}';
    }
}
