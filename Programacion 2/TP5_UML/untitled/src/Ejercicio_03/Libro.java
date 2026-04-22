package Ejercicio_03;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo,String isbn,Autor autor,Editorial editorial){
        setIsbn(isbn);
        setTitulo(titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null ||  titulo.isBlank()){
            System.out.println("El titulo no puede estar vacio");
            this.titulo = "Sin titulo";
        }else{
            this.titulo = titulo;
        }
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        if(isbn == null || isbn.isBlank()){
            System.out.println("El isbn no puede estar vacio");
            this.isbn = "Sin isbn";
        }else {
            this.isbn = isbn;
        }
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + "]";
    }
}
