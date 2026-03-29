import java.util.Scanner;

public class Ejercicio_06 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 06");
        contadorNum();
    }

    /**
     * Solicita al usuario que ingrese un número entero, validando la entrada.
     * Si la entrada no es válida, solicita nuevamente hasta que sea un número entero.
     *
     * @return el número entero ingresado por el usuario
     */
    private static int pedirNumero() {
        while (true) {
            System.out.print("Ingrese un numero: ");
            String entrada = sc.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }

    /**
     * Realiza el conteo de números positivos, negativos y ceros ingresados por el usuario.
     * Muestra el resultado en la consola.
     */
    private static void contadorNum() {
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int sumaCero = 0;
        int numero;
        for (int i = 0; i < 10; i++) {
            numero = pedirNumero();
            if (numero == 0) {
                sumaCero++;
            } else if (numero > 0) {
                sumaPositivos++;
            } else if (numero<0) {
                sumaNegativos++;

            }
        }
        System.out.println("Cantidad de positivos: " + sumaPositivos);
        System.out.println("Cantidad de negativos: " + sumaNegativos);
        System.out.println("Cantidad de ceros: " + sumaCero);
    }
}
