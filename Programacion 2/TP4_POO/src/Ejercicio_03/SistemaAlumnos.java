package Ejercicio_03;

public class SistemaAlumnos {
    private String nombre;
    private double promedio;
    static double notaAprobacion = 6;

    /*
    1.- Constructor por defecto
    2.- Constructor con nombre y nota por defecto
     */
    public SistemaAlumnos(String nombre, double nota) {
        this.nombre = nombre;
        this.promedio = nota;
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            System.out.println("ERROR: La nota debe estar entre 0 y 10");
        }else{
            this.promedio = promedio;
        }
    }
    public void actualizarPromedio(double promedio){
        if (promedio < 0 || promedio > 10) {
            System.out.println("ERROR: La nota debe estar entre 0 y 10");

        }else {
            this.promedio = promedio;
        }
    }
    public void actualizarPromedio(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("ERROR: No se proporcionaron notas.");
            return;
        }

        double suma = 0;
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                System.out.println("ERROR: Nota " + nota + " fuera de rango (0-10).");
                return;
            }
            suma += nota;
        }
        double resultado = suma / notas.length;
        actualizarPromedio(resultado);
    }
    public boolean aprobo(){
        return promedio >= notaAprobacion;
    }

    public static void cambiarNotaAprobacion(double nuevaNota) {
        if (nuevaNota<0 || nuevaNota>10){
            System.out.println("ERROR: La nota aprobacion debe estar entre 0 y 10");
        }else{
            notaAprobacion = nuevaNota;
        }
    }
    @Override
    public String toString() {
        return "SistemaAlumnos{" +
                "nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                ", Aprobo?=" + aprobo() +
                '}';
    }
}

