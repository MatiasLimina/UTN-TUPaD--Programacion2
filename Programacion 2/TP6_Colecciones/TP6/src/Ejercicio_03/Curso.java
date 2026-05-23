package Ejercicio_03;

import java.util.Objects;

public class Curso {
    private final String codigo;
    private String nombre;
    private Profesor profesor;
    private static int contador;

    public Curso(String nombre, Profesor profesor) {
        this.codigo = "CUR-" + contador++;
        setNombre(nombre);
        setProfesor(profesor);
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
                    this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
    }
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return;
        }

        if (this.profesor != null) {
            Profesor profeAux = this.profesor;
            this.profesor = null;
            profeAux.eliminarCurso(this);
        }
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    public void mostrarInfo(){
        System.out.println("----------------------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + profesor.getNombre());
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor.getNombre() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
