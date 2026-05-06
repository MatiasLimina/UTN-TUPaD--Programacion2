package Ejercicio_04;

import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;

    public Biblioteca(List<Libro> listaLibros) {
        setListaLibros(listaLibros);
    }
    public List<Libro> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(List<Libro> listaLibros) {
        if (listaLibros == null) {
            System.out.println("ERROR: la lista de libros no puede ser nula");
        }else {
            this.listaLibros = listaLibros;
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                '}';
    }
}
