package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    public Biblioteca(String nombre) {
        setNombre(nombre);
        this.libros = new ArrayList<>();
    }
    public Biblioteca(){
        this("Sin nombre");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(Utilidades.verificarString(nombre) == null){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
        }

        public void agregarlibro(String titulo,int anioPublicacion,Autor autor){
            for(Libro l : libros){
                if(l.getTitulo().equals(titulo)){
                    System.out.println("El libro ya existe");
                    return;
                }
            }
            libros.add(new Libro(titulo,anioPublicacion,autor));
        }
        public void listarLibros(){
            if (libros.isEmpty()){
                System.out.println("No hay libros en la biblioteca");
            }else  {
                for (Libro l : libros) {
                    l.mostrarInfo();
                }
            }
        }

        public Libro buscarLibroPorIsbn(String isbn){
            for (Libro l : libros) {
                if(l.getIsbn().equals(isbn)){
                    System.out.println("Libro encontrado!");
                    return l;
                }
            }
            System.out.println("No se encontro el libro");
            return null;
        }

        public void eliminarLibro(String isbn){
            boolean encontrado = false;
            for (Libro l : libros){
                if(l.getIsbn().equals(isbn)){
                    libros.remove(l);
                    System.out.println("Libro eliminado");
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("No se encontro el libro");
            }
        }

        public void obtenerCantidadLibros(){
            if (libros.isEmpty()){
                System.out.println("No hay libros en la biblioteca");
            }else {
                System.out.println("Cantidad de libros: " + libros.size());
            }
        }

        public void filtrarLibrosPorAnio(int anio){
            if (libros.isEmpty()){
                System.out.println("No hay libros en la biblioteca");
            }else {
                System.out.println("Libros publicados en el año " + anio + ":");
                for (Libro l : libros) {
                    if(l.getAnioPublicacion() == anio){
                        l.mostrarInfo();
                    }
                }
            }
        }

        public void mostrarAutoresDisponibles(){
            System.out.println("Autores disponibles: ");
            for (Libro l : libros) {
                System.out.println(l.getAutor());
            }
        }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
}
