package Ejercicio_01;

public class RegistroEstudiante {
    private String nombre;
    private String apellido;
    private String cursos;
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

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        if (cursos == null || cursos.isEmpty()){
            System.out.println("Los cursos no pueden estar vacios");
        }else{
            this.cursos = cursos;
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
}
