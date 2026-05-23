package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Profesor {
    private final String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    private static int contador = 1;

    public Profesor(String nombre, String especialidad) {
        this.id = "PROF-" + contador++;
        setNombre(nombre);
        setEspecialidad(especialidad);
        this.cursos = new ArrayList<>();

    }
    public Profesor(String nombre) {
        this(nombre,"Sin especialidad");
    }
    public Profesor() {
        this("Sin nombre","Sin especialidad");
    }
    public String getId() {
        return id;
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
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        if(especialidad == null || especialidad.isBlank()){
            System.out.println("La especialidad no puede estar vacia");
            this.especialidad = "Sin especialidad";
        }else {
            this.especialidad = especialidad;
        }
    }
    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso c) {
            if (c != null && !this.cursos.contains(c)) {
                this.cursos.add(c);
                c.setProfesor(this);
            }
        }
    public void eliminarCurso(Curso c){
        if(this.cursos.contains(c)){
            this.cursos.remove(c);
            c.setProfesor(null);

        }
    }

    public void listarCursos(){
        for (Curso c : cursos){
            c.mostrarInfo();
        }
    }
    public void mostrarInfo(){
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos: ");
        listarCursos();
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cursos=" + cursos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(id, profesor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}



