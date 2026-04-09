package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        BancaSimple banco1 = new BancaSimple("Juan", 1000);
        System.out.println(banco1.toString());
        banco1.depositar(500);
        System.out.println(banco1.toString());
        banco1.retirar(200);
        System.out.println(banco1.toString());
        System.out.println("----------------------------------");
        BancaSimple banco2 = new BancaSimple("Maria");
        System.out.println(banco2.toString());
        banco2.retirar(1000);
        System.out.println(banco2.toString());
        BancaSimple.mostrarTotalCuentas();
        System.out.println("----------------------------------");
        BancaSimple cuenta3 = new BancaSimple("Pedro",200);
        BancaSimple cuenta4 = new BancaSimple("Ana",3000);
        BancaSimple.mostrarTotalCuentas();
    }
}
