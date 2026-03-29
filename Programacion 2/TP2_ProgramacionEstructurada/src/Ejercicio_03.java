import java.util.Scanner;

public class Ejercicio_03 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 03");
        int edad = pedirEdad();
        etapaVida(edad);
    }
    /**
     * Solicita al usuario que ingrese su edad y la devuelve.
     * @return la edad ingresada por el usuario como un valor entero
     */
    private static int pedirEdad(){

        while (true){
            System.out.println("Ingrese su edad:");
            String entrada = sc.nextLine();
            try{
                int edad = Integer.parseInt(entrada);
                if (edad >= 0){
                    return edad;
                }else {
                    System.out.println("La edad no puede ser negativa. Intente nuevamente.");
                }
            } catch (NumberFormatException e){
                System.out.println("La entrada no es un número válido. Intente nuevamente.");
            }
        }
    }
    /**
     * Determina la etapa de vida de una persona según su edad.
     * @param edad la edad de la persona
     */
    private static void etapaVida(int edad){
        if (edad < 12){
            System.out.print("Eres un Niño");
        } else if (edad < 18 && edad >= 12 ){
            System.out.print("Eres un Adolescente");
        } else if (edad >= 18 && edad < 60){
            System.out.print("Eres un Adulto");
        } else{
            System.out.print("Eres un Adulto mayor");
        }
    }
}
