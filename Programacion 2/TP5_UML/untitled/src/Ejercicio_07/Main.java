package Ejercicio_07;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Benzina", "123456789");
        Conductor conductor = new Conductor("Pepe","A",null);
        Vehiculo miAuto = new Vehiculo("123456789","Uno",motor,conductor);
        System.out.println(miAuto);
        System.out.println(conductor);
    }
}
