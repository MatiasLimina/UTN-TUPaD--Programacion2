package Ejercicio_03;

public class SistemaAlumnos {
    private String nombre;
    private double nota;
    static double notaAprobacion = 6;

    /*
    1.- Constructor por defecto
    2.- Constructor con nombre y nota por defecto
     */
    public SistemaAlumnos(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public SistemaAlumnos(String nombre){
        this(nombre, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("ERROR: El nombre no puede ser nulo o estar vacio");
        }else {
            this.nombre = nombre;
        }

    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("ERROR: La nota debe estar entre 0 y 10");
        }else{
            this.nota = nota;
        }
    }


}
