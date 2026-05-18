package Ejercicio_04;

public class Libro {
    private String titulo;
    private Autor autor;

    public Libro(String titulo, Autor autor) {
        setTitulo(titulo);
        setAutor(autor);
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("ERROR: el titulo no puede estar vacio");
            this.titulo = "Sin titulo";
        } else {
            this.titulo = titulo;
        }
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        if (autor == null) {
            System.out.println("ERROR: el autor no puede ser nulo");
        }else{
            this.autor = autor;
        }
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor.getNombre() +
                '}';
    }
}
