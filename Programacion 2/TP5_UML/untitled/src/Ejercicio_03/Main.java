package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Editorial mieditorial = new Editorial("Miguel", "Calle 123");
        Autor miAutor = new Autor("Toto","Portugal");
        Libro miLibro = new Libro("Peru Recharged","123-xf-32",miAutor,mieditorial);
        System.out.println(miLibro);
    }
}
