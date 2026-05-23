package Ejercicio_03;

public class EmpleadoPlanta extends  Empleado {
    private double sueldoBase;
    private int antiguedad;

    public EmpleadoPlanta(String nombre,double sueldoBase, int antiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }
    @Override
    public double calcularSalario() {
        return sueldoBase + antiguedad*sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta{" +
                "sueldoBase=" + sueldoBase +
                ", antiguedad=" + antiguedad +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
