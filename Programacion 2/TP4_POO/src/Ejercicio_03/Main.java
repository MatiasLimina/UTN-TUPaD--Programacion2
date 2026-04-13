package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 03 - Alumnos");
        SistemaAlumnos alumno1 = new SistemaAlumnos("Juan", 2);
        System.out.println(alumno1.toString());
        SistemaAlumnos alumno2 = new SistemaAlumnos("Maria");
        System.out.println(alumno2.toString());
        alumno1.actualizarPromedio(26);
        alumno1.actualizarPromedio(8);
        System.out.println(alumno1.toString());
        alumno2.actualizarPromedio(new double[]{2, 3, 10, 5});
        System.out.println(alumno2.toString());
        SistemaAlumnos.notaAprobacion = 5;
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        alumno1.setNombre("");
        alumno1.setNombre("Jose");
        System.out.println(alumno1.toString());
        alumno2.setPromedio(4);
        System.out.println(alumno2.toString());
    }
}
