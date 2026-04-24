package Ejercicio_06;

public class Main {
    public static void main(String[] args) {
            Mesa mesa = new Mesa(1, 10);
            Cliente cliente = new Cliente("Juan", "+54 261 434333");
            Reserva reserva = new Reserva("2023-01-01", "10:00", cliente, mesa);
            System.out.println(reserva);
    }
}
