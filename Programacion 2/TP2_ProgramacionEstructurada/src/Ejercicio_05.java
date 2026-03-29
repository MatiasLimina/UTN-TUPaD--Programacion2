import java.util.Scanner;

public class Ejercicio_05 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 05");
        sumaPares();

    }

    /**
     * Le pide al usuario que ingrese un número entero.
     * @return El número ingresado por el usuario.
     * @throws NumberFormatException si la entrada no es un número válido.
     */
    private static int pedirNumero() {
        while (true) {
            System.out.print("Ingrese un numero (presione 0 para salir): ");
            String entrada = sc.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }

    /**
     * Calcula la suma de los números pares ingresados por el usuario.
     * Muestra el resultado final en la consola.
     */
    private static void sumaPares(){
        int suma = 0;
        int n = 1;
        while (n != 0){
            n = pedirNumero();
            if (n == 0){
                break;
            }else if (n % 2 == 0){
                suma += n;
            }
        }
        System.out.println("La suma de los numeros pares es: " + suma);

}
}
