package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Asu-123", 100);
        Celular celular = new Celular(123456789, "Samsung", "Galaxy S23", null,bateria);
        Usuario usuario = new Usuario("Juan", 12345678, celular);
        System.out.println(usuario);
        System.out.println(celular);
    }
}
