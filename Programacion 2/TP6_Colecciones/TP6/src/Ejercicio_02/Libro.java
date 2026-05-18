package Ejercicio_02;

import java.util.Objects;

import static Ejercicio_02.Utilidades.verificarString;

public class Libro {
    private final String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    private static int contador = 100;

    public Libro(String titulo, int anioPublicacion, Autor autor) {
        this.isbn = "ISBN-" + contador++;
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);
        setAutor(autor);
    }
    public Libro(String titulo, Autor autor) {
        this(titulo,0,autor);
    }
    public Libro(String titulo) {
        this(titulo,0,new Autor());
    }
    public Libro() {
        this("Sin titulo",0,new Autor());
    }


    public String getIsbn() {
        return isbn;
    }
    public String  getTitulo(){
        return  titulo;
    }
    public void setTitulo(String titulo) {
        if(verificarString(titulo) == null){
            System.out.println("El titulo no puede estar vacio");
            this.titulo = "Sin titulo";
        }else {
            this.titulo = titulo;
        }
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion < 0){
            System.out.println("El año de publicacion no puede ser negativo");
            this.anioPublicacion = 0;
        }else {
            this.anioPublicacion = anioPublicacion;
        }
        }

        public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        if(autor == null){
            System.out.println("El autor no puede estar vacio");
            this.autor = new Autor();
        }else {
            this.autor = autor;
        }
    }
    public void mostrarInfo(){
        System.out.println("----------------------");
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre());
        autor.mostrarInfo();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", autor=" + autor.getNombre() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
