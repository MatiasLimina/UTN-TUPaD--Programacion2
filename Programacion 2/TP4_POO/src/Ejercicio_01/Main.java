package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 01 - Empleados");
        Empleado empleado1 = new Empleado("Juan", "Gerente", 1000);
        Empleado.mostrarTotalEmpleados(Empleado.getTotalEmpleados());
        Empleado empleado2 = new Empleado("Maria", "Analista", 500);
        Empleado empleado3 = new Empleado("Pedro", "Programador");

        Empleado.mostrarTotalEmpleados(Empleado.getTotalEmpleados());
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        empleado1.actualizarSalario(100);
        empleado2.actualizarSalario(200);
        empleado3.actualizarSalario(50);
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        empleado1.actualizarSalario(20.5);
        System.out.println(empleado1.toString());
        empleado1.actualizarSalario(-20.5);
        empleado1.actualizarSalario(-20);
        System.out.println(empleado1.toString());
        empleado1.setNombre("");
        System.out.println(empleado1.toString());
        empleado1.setPuesto(null);
        empleado2.setSalario(-300);
    }
}
