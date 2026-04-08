package Ejercicio_01;

public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;
    static int contadorID = 1;

    /*
     * Constructores:
     * 1.- Constructor por defecto
     * 2.- Constructor con salario por defecto
     */
    public Empleado(String nombre, String puesto, double salario) {
        this.id = contadorID++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    public Empleado(String nombre, String puesto) {
        this(nombre, puesto, 100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty() || nombre.equals("null")) {
            System.out.println("ERROR: El nombre no puede ser nulo o estar vacio");
        }else {
            this.nombre = nombre;
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto == null || puesto.isEmpty() || puesto.equals("null")) {
            System.out.println("ERROR: El puesto no puede ser nulo o estar vacio");
        }else{
            this.puesto = puesto;
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("ERROR: Salario no puede ser negativo");
        }else {
            this.salario = salario;
        }
    }

    public int getId() {
        return id;
    }
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    public static void mostrarTotalEmpleados(int totalEmpleados) {
        System.out.println("Total de empleados: " + totalEmpleados);
    }
    public void actualizarSalario(int aumento){
        if (aumento < 0) {
            System.out.println("ERROR: El aumento no puede ser negativo");
        }else {
            this.salario = salario + aumento;
        }

    }
    public void actualizarSalario(double aumento){
        if (aumento < 0) {
            System.out.println("ERROR: El aumento no puede ser negativo");
        }else {
            aumento = aumento / 100;
            this.salario += salario*aumento;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
