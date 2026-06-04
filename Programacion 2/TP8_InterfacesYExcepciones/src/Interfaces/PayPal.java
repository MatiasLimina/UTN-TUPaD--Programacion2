package Interfaces;

public class PayPal implements PagoConDescuento, Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " a través de PayPal.");
    }

    @Override
    public void aplicarDescuento(double monto, double descuento) {
        double totalConDescuento = monto - descuento;
        System.out.println("Se aplicó un descuento. Total a pagar por PayPal: $" + totalConDescuento);
    }

}
