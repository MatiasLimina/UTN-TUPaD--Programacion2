import java.util.Scanner;
public class Ejercicio_01 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 01");
        mostrarResultado(solicitarAño());
    }

    /**
     * Solicita al usuario que ingrese un año y lo devuelve.
     * @return año ingresado por el usuario
     */
    private static int solicitarAño(){
        while (true) {
            System.out.println("Ingrese un año: ");
            String entrada = sc.nextLine();
            try{
                int año = Integer.parseInt(entrada);
                if(año > 0){
                    return año;
                } else {
                    System.out.println("Año no válido. Debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número válido.");
            }
        }
    }

    /**
     * Verifica si el año es bisiesto.
     * @param año año ingresado por el usuario
     * @return true si el año es bisiesto, false en caso contrario
     */
    private static boolean esBisiesto(int año){
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Muestra el resultado del año ingresado por el usuario.
     * @param año año ingresado por el usuario
     */
    private static void mostrarResultado(int año){
        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }









}
