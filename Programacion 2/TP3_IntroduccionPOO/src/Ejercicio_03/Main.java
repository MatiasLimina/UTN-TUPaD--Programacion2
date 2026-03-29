package Ejercicio_03;

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
        System.out.println("----------------------------------------");
        System.out.println("Prueba de libro valido:");

        Libro libroValido = new Libro();
        libroValido.setTitulo("Titulo de prueba");
        libroValido.setAutor("Autor de prueba");
        libroValido.setAñoPublicacion(2025);
        libroValido.mostrarInfo();
        libroValido.modificarAñoPublicacion(2000);
        libroValido.mostrarInfo();
        System.out.println("----------------------------------------");
    }
}
