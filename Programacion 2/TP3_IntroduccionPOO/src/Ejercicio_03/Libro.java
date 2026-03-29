package Ejercicio_03;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()){
            System.out.println("El titulo no puede estar vacio");
        }else{
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null || autor.trim().isEmpty()){
            System.out.println("El autor no puede estar vacio");
        }else{
            this.autor = autor;
        }
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if(añoPublicacion <= 0){
            System.out.println("El año de publicacion debe ser positivo");
        }else if(añoPublicacion > 2026){
            System.out.println("El año de publicacion no puede ser mayor al actual");
        }else{
            this.añoPublicacion = añoPublicacion;
        }
    }

    /**
     * Muestra la informacion del libro
     */
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
    }

    public void modificarAñoPublicacion(int añoPublicacion){
        if(añoPublicacion <= 0){
            System.out.println("El año de publicacion debe ser positivo");
        }else if(añoPublicacion > 2026){
            System.out.println("El año de publicacion no puede ser mayor al actual");
        }else{
            this.añoPublicacion = añoPublicacion;
        }
    }
}
