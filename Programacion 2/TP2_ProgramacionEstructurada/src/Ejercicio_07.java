import java.util.Scanner;

public class Ejercicio_07 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ejercicio 07");
        validarNota();
    }

    /**
     * Solicita al usuario que ingrese una nota entre 0 y 10, validando la entrada.
     * @return la nota ingresada por el usuario como un valor entero
     */
    private static int pedirNota() {
        while (true) {
            System.out.print("Ingrese una nota(0-10): ");
            String entrada = sc.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }

    /**
     * Valida que la nota ingresada por el usuario esté dentro del rango válido (0-10).
     * Informa al usuario si la nota se guardo correctamente.
     */
    private static void validarNota() {
        int nota ;
        do{
            nota = pedirNota();
            if((nota < 0 || nota > 10)){
                System.out.println("Nota fuera de rango. Por favor, ingrese una nota entre 0 y 10.");
            }
        }while(nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");

    }
}

