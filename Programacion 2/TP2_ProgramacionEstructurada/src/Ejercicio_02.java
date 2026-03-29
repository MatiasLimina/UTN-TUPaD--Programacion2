import java.util.Scanner;
public class Ejercicio_02 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 02");
        int[] numeros = pedirNumeros();
        int mayor = mayorNum(numeros);
        System.out.println("El mayor numero es: " + mayor);
    }

    /**
     * Solicita al usuario que ingrese tres números enteros y los devuelve en un arreglo.
     * @return un arreglo de tres números enteros ingresados por el usuario
     */
    private static int[] pedirNumeros(){

        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el numero " + (i+1));
            while (true){
                String entrada = sc.nextLine();
                try{
                    numeros[i] = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Ingrese un número válido.");
                }
            }
        }
        return numeros;
    }

    /**
     * Busca el mayor número en un arreglo de números enteros.
     * @param numeros un arreglo de números enteros
     * @return el mayor número del arreglo
     */
     private static int mayorNum(int[] numeros){
            int mayor = numeros[0];
            for (int i = 1; i < numeros.length; i++){
                if (numeros[i] > mayor){
                    mayor = numeros[i];
                }
            }
            return mayor;
            }
}


