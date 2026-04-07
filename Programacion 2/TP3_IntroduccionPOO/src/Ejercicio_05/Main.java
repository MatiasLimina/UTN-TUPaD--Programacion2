package Ejercicio_05;

public class Main {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Nave 1");
        nave.setCombustible(50);
        nave.despegar();
        nave.avanzar(50);
        nave.recargarCombustible(200);
        nave.avanzar(6);
        nave.mostrarInfo();

    }
}
