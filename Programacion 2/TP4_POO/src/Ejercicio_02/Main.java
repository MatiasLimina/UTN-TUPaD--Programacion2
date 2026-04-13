package Ejercicio_02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 02 - Registro de libros");
        SistemaRegistroLibros libro1 = new SistemaRegistroLibros("El Principito", "Antoine de Saint-Exupéry");
        libro1.actualizarTitulo("El Principito", "Edicion Especial: ");
        libro1.actualizarTitulo("");
        System.out.println(libro1.toString());
        System.out.println("----------------------------------------");
        SistemaRegistroLibros libro2 = new SistemaRegistroLibros("Lord of The Mysteries", "Cuttlefish that loves diving","EspecialLibros");
        System.out.println(libro2.toString());
        libro2.actualizarTitulo("Circle of Inevitability", "");
        System.out.println(libro2.toString());
        libro2.setAutor("");
        SistemaRegistroLibros.cambiarEditorial("PepitoLibros");
        System.out.println(libro2.toString());
        System.out.println(libro1.toString());
    }
}
