package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("J.K. Rowling", "Británica");
        Autor autor3 = new Autor("Jorge Luis Borges", "Argentino");

        // Agregar libros
        biblioteca.agregarlibro("Cien años de soledad", 1967, autor1);
        biblioteca.agregarlibro("Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarlibro("El Aleph", 1949, autor3);
        biblioteca.agregarlibro("Crónica de una muerte anunciada", 1981, autor1);

        // Listar todos los libros
        System.out.println("--- Lista completa de libros ---");
        biblioteca.listarLibros();

        // Buscar libro por ISBN
        System.out.println("\n--- Buscando libro ISBN-101 ---");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN-101");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }

        // Filtrar por año
        System.out.println("\n--- Filtrando libros del año 1967 ---");
        biblioteca.filtrarLibrosPorAnio(1967);

        // Mostrar cantidad total
        System.out.println("\n--- Cantidad total ---");
        biblioteca.obtenerCantidadLibros();

        // Mostrar autores
        System.out.println("\n--- Autores en la biblioteca ---");
        biblioteca.mostrarAutoresDisponibles();

        // Eliminar un libro
        System.out.println("\n--- Eliminando libro ISBN-102 ---");
        biblioteca.eliminarLibro("ISBN-102");

        // Listar libros restantes
        System.out.println("\n--- Lista final de libros ---");
        biblioteca.listarLibros();
    }

}
