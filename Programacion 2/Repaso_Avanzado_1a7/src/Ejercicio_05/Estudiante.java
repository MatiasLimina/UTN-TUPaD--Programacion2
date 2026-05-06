package Ejercicio_05;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int edad;
    private int nota;

    public Estudiante(String nombre, int edad, int nota) {
        setNombre(nombre);
        setEdad(edad);
        setNota(nota);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0){
            System.out.println("ERROR: la edad debe ser mayor a 0");
            this.edad = 0;
        }else {
            this.edad = edad;
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota < 0 || nota > 10){
            System.out.println("ERROR: la nota debe estar entre 0 y 10");
            this.nota = 0;
        }else {
            this.nota = nota;
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(nombre, estudiante.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
