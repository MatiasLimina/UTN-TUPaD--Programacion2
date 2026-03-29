import java.util.Scanner;
/*
Ejercicio 2: Gestión de Temperaturas Críticas (Matrices y Estadísticas)

Objetivo: Dominio de arreglos multidimensionales y orquestación de cálculos.

Enunciado: Una planta industrial registra temperaturas cada 4 horas durante 3 días (Matriz 3x6). El programa debe: 1. Cargar la matriz validando que las temperaturas estén entre -50°C y 100°C. 2. Calcular el promedio por día. 3. Determinar el día con la temperatura máxima absoluta.

Requisitos: - Uso de Integer.parseInt(scanner.nextLine()) para evitar saltos de buffer.

Método para carga de datos con validación.

Método para calcular promedio de una fila específica.

Método para encontrar el máximo de toda la matriz.
*/

public class Ejercicio_02 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 02");
    }
public static double leerValor() {
    double valor;
    while (true) {
        try {
            valor = Double.parseDouble(scanner.nextLine());
            if (valor >= -50 && valor <= 100) {
                return valor;
            } else {
                System.out.println("Temperatura fuera de rango. Intente nuevamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Intente nuevamente.");
        }
    }
}
public static boolean isValidValue(double value){
        return value >= -50 && value <= 100;
}

}
