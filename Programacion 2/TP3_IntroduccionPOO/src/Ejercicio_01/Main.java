package Ejercicio_01;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 01");
        System.out.println("Prueba de errores:");
        RegistroEstudiante estudianteErrores = new RegistroEstudiante();
        estudianteErrores.setNombre(null);
        estudianteErrores.setApellido("Perez");
        estudianteErrores.setCalificacion(8.5);
        estudianteErrores.setCurso("");
        System.out.println("Prueba de limites al bajar o subir calificacion");
        estudianteErrores.setPuntos(-55.4);
        estudianteErrores.setPuntos(15);
        estudianteErrores.bajarCalificacion();
        estudianteErrores.mostrarInfo();
        estudianteErrores.setPuntos(55.4);
        estudianteErrores.subirCalificacion();
        estudianteErrores.mostrarInfo();
        System.out.println("----------------------------------------");
        System.out.println("Estudiante sin errores:");
        RegistroEstudiante estudiante = new RegistroEstudiante();
        estudiante.setNombre("Juan");
        estudiante.setApellido("Perez");
        estudiante.setCalificacion(4);
        estudiante.setCurso("Java");
        estudiante.setPuntos(5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion();
        estudiante.mostrarInfo();
        estudiante.setPuntos(1);
        estudiante.bajarCalificacion();
        estudiante.mostrarInfo();
        System.out.println("----------------------------------------");
    }
}
