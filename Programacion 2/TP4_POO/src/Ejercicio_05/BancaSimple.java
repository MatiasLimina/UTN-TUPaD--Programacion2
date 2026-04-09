package Ejercicio_05;

public class BancaSimple {
    private final int numero;
    private String nombre;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    public BancaSimple(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            System.out.println("ERROR: El saldo inicial no puede ser negativo");
            System.out.println("Se asignara el valor por defecto: 0");
            saldoInicial = 0;
        }
        this.numero = ultimoNumero++;
        this.nombre = titular;
        this.saldo = saldoInicial;
        totalCuentas++;
    }
    public BancaSimple(String titular) {
        this(titular, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty() || nombre.equals("null")){
            System.out.println("ERROR: El nombre no puede ser nulo o estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public void setSaldo(double saldo) {
        if(saldo<0){
            System.out.println("ERROR: El saldo no puede ser negativo");
        }else{
            this.saldo = saldo;
        }
    }
    public double consultarSaldo(){
        return saldo;
    }

    public double consultarSaldo(double cotizacionDolar) {
        if (cotizacionDolar <= 0) {
            System.out.println("ERROR: La cotización debe ser mayor a cero.");
            return saldo;
        }else {
            return saldo / cotizacionDolar;
        }
    }
    public void depositar(double cantidad){
        saldo += cantidad;
    }
    public void retirar(double cantidad){
        if (cantidad > saldo) {
            System.out.println("ERROR: No hay suficiente saldo en la cuenta.");
        }else {
            saldo -= cantidad;
        }
    }

}
