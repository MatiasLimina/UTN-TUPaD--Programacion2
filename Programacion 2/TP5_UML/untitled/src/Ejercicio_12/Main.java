package Ejercicio_12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Roberto","2245666788");
        Impuesto impuesto = new Impuesto(20,contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
