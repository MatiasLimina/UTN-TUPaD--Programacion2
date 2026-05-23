package Ejercicio_03;

public class EmpleadoTemporal extends  Empleado {
    private double sueldoBase;
    private int diasTrabajados;

    public EmpleadoTemporal(String nombre, int sueldoBase, int diasTrabajados){
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.diasTrabajados = diasTrabajados;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public double calcularSalario() {
        return  sueldoBase + diasTrabajados;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" +
                "sueldoBase=" + sueldoBase +
                ", diasTrabajados=" + diasTrabajados +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
