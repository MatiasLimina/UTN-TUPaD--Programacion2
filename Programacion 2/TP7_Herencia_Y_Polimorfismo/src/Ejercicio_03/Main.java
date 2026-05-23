package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente,
        usar instanceof para clasificar
         */
        
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Juan", 1500.0, 5));
        empleados.add(new EmpleadoTemporal("Maria", 1000, 10));
        empleados.add(new EmpleadoPlanta("Carlos", 2000.0, 2));
        empleados.add(new EmpleadoTemporal("Ana", 1200, 15));

        System.out.println("--- Salarios ---");
        for (Empleado e : empleados) {
            System.out.println("Salario de " + e.getNombre() + ": $" + e.calcularSalario());
        }

        System.out.println("\n--- Clasificación ---");
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.getNombre() + " es un Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.getNombre() + " es un Empleado Temporal");
            }
        }
    }
}
