package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Propietario propietario1 = new Propietario("Facu",45678999,null);
        Computadora miComputadora = new Computadora("Asus", "123456789","Aorus","AMD-7 3700x",propietario1);
        System.out.println(miComputadora);
        System.out.println(propietario1);
    }

}
