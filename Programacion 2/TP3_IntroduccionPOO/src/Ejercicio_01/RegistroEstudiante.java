package Ejercicio_01;

public class RegistroEstudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty())
            System.out.println("El nombre no puede estar vacio");
        else {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.isEmpty()){
            System.out.println("El apellido no puede estar vacio");
        }else{
            this.apellido = apellido;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isEmpty()){
            System.out.println("Los cursos no pueden estar vacios");
        }else{
            this.curso = curso;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10){
            System.out.println("La calificacion debe estar entre 0 y 10");
        }else{
            this.calificacion = calificacion;
        }
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }



}
