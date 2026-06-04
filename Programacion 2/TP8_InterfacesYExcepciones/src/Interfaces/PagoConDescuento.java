package Interfaces;

public interface PagoConDescuento extends  Pago {
    public abstract  void aplicarDescuento(double monto, double descuento);
}
