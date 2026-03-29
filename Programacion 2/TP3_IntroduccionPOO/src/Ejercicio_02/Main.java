package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 02");
        System.out.println("Prueba de Errores:");
        Libro libroErrores = new Libro();
        libroErrores.setTitulo("");
        libroErrores.setAutor(null);
        libroErrores.setAñoPublicacion(202500);
        libroErrores.mostrarInfo();
        libroErrores.modificarAñoPublicacion(2027);
        libroErrores.mostrarInfo();
    }
}
