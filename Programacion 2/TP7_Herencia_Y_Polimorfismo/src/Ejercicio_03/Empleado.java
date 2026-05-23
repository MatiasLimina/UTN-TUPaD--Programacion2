package Ejercicio_03;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }
}
