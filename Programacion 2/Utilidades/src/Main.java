import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        }
    // Wrapper para leer Decimales (Soporta coma y punto)
    public static double leerDouble(Scanner sc, String mensaje) {
        double numero = 0;
        boolean datoValido = false;
        do {
            try {
                System.out.print(mensaje);
                String textoIngresado = sc.nextLine();
// Reemplazamos coma por punto para evitar el error de formato en Java
                String textoNormalizado = textoIngresado.replace(',', '.');
                numero = Double.parseDouble(textoNormalizado);
                datoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número decimal válido (ej: 75.5 o 75,5).");
            }
        } while (!datoValido);
        return numero;
    }
    // Leer y validar CUIT
    public static String leerCUIT(Scanner sc) {
        String cuit = "";
        boolean valido = false;
        do {
            System.out.print("Ingrese CUIT (11 números sin guiones): ");
            cuit = sc.nextLine();
// Validamos longitud y que sean solo números (Regex)
            if (cuit.matches("[0-9]{11}")) {
                valido = true;
            } else {
                System.out.println("Error: El CUIT debe tener 11 dígitos numéricos.");
            }
        } while (!valido);
        return cuit;
    }
    //validacion correo electronico
    public static String leerEmail(Scanner sc) {
        String email = "";
        boolean emailValido = false;
        do {
            System.out.print("Ingrese su Email: ");
            email = sc.nextLine();
// Aplicamos reglas básicas de negocio: debe contener '@' y no tener espacios
            if (email.contains("@") && !email.contains(" ")) {
                emailValido = true; // El formato básico es aceptado
            } else {
                System.out.println("Error: Formato de correo inválido. Asegúrese de incluir '@' y no usar espacios.");
            }
        } while (!emailValido);
        return email;
    }
    }


