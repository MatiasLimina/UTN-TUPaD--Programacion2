package Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan", 12345678, null);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(123456789, 1000.0, titular, "123456", "2023-01-01");
        System.out.println(cuentaBancaria);
        System.out.println(titular);
    }
}
