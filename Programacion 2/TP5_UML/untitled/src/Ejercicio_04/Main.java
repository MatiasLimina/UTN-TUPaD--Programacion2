package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Galicia","32-23456777-0");
        Cliente miCliente = new Cliente("Juan",12345678,null);
        TarjetaDeCredito miTarjeta = new TarjetaDeCredito("1234567890123456", "12/2026", miBanco, miCliente);
        System.out.println(miTarjeta);
        System.out.println(miCliente);

        Banco miBanco2 = new Banco("Macro","32-55556777-0");
        Cliente miCliente2 = new Cliente("Pedro",12345678,null);
        TarjetaDeCredito tarjeta2= new TarjetaDeCredito("1111222233334444", "12/2026", miBanco2, miCliente2);
        System.out.println(tarjeta2);
        System.out.println(miCliente2);
    }
}
