package Ejercicio_06;

public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private String fecha;
    private String hora;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa){
        setCliente(cliente);
        setMesa(mesa);
        setFecha(fecha);
        setHora(hora);
    }

    public Cliente getCliente() {
        return cliente;
    }
    public Mesa getMesa() {
        return mesa;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }

    public void setCliente(Cliente cliente) {
        if ( cliente == null ){
            return;
        }else {
            this.cliente = cliente;
        }
    }
    public void setMesa(Mesa mesa) {
        if ( mesa == null){
            return;
        }else {
            this.mesa = mesa;
        }
    }
    public void setFecha(String fecha) {
        if(fecha == null || fecha.isBlank()){
            System.out.println("La fecha no puede estar vacia");
            this.fecha = "00/00/0000";
        }else {
            this.fecha = fecha;
        }
    }
    public void setHora(String hora) {
        if ( hora == null || hora.isBlank() ){
            System.out.println("La hora no puede estar vacia");
            this.hora = "00:00";
        }else {
            this.hora = hora;
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente.getNombre() + ", mesa N°=" + mesa.getNumero() + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
}
