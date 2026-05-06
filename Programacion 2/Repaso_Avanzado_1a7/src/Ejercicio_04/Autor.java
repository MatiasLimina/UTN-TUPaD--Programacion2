package Ejercicio_04;

import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nombre;
    private List<Libro> libros;

    public Autor(String nombre, List<Libro> libros) {
        setNombre(nombre);
        setLibros(libros);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()){
            System.out.println("ERROR: el nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        if (libros == null) {
            System.out.println("ERROR: la lista de libros no puede ser nula");
        }else{
            this.libros = libros;
            for (Libro l : libros) {
                if (l != null) {
                    l.setAutor(this);
                }
            }
        }
    }
    public void addLibro(Libro libro) {
        // 1. Verificamos que no sea nulo para evitar el NullPointerException
        if (libro == null) {
            System.out.println("ERROR: No se puede añadir un libro nulo.");
            return;
        }

        // 2. Solo lo agregamos si no estaba ya en la lista (evita duplicados)
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            // 3. Establecemos el autor en el libro
            libro.setAutor(this);
        }
    }

    public void mostrarLibros(List<Libro> libros){
        if (libros.isEmpty()){
            System.out.println(getNombre() + " no tiene libros publicados");
        }else{
            for (Libro libro : libros){
                System.out.println(libro);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
}
