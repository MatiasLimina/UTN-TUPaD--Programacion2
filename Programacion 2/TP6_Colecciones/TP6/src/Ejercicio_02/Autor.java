package Ejercicio_02;

import java.util.Objects;

import static Ejercicio_02.Utilidades.verificarString;

public class Autor {
    private final String id;
    private String nombre;
    private String nacionalidad;
    private int contador = 1;

    public Autor (String nombre, String nacionalidad) {
        this.id = "AUT-"+contador++;
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }
    public Autor (String nombre) {
        this(nombre,"Sin nacionalidad");
    }
    public Autor () {
        this("Sin nombre","Sin nacionalidad");
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(verificarString(nombre) == null){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        if(verificarString(nacionalidad) == null){
            System.out.println("La nacionalidad no puede estar vacia");
            this.nacionalidad = "Sin nacionalidad";
        }else {
            this.nacionalidad = nacionalidad;
        }
    }

    public void mostrarInfo(){
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", contador=" + contador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(id, autor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
