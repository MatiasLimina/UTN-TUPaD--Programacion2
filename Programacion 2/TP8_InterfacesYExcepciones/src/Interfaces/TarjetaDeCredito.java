package Interfaces;

public class TarjetaDeCredito implements PagoConDescuento, Pago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
    }

    @Override
    public void aplicarDescuento(double monto, double descuento) {
        double totalConDescuento = monto - descuento;
        System.out.println("Se aplicó un descuento del 10%. Total a pagar: $" + totalConDescuento);
    }


}
