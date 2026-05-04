package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Matias",1000);
        System.out.println(cuentaBancaria);
        cuentaBancaria.depositar(500);
        System.out.println(cuentaBancaria);
        cuentaBancaria.retirar(2000);
        System.out.println(cuentaBancaria);
        cuentaBancaria.retirar(5000);
        System.out.println(cuentaBancaria);
    }
}
