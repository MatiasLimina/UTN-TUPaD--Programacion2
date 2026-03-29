import java.util.Scanner;
public class Ejercicio_08 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 08");
        double precio = pedirPrecio();
        double impuesto = pedirImpuesto();
        double descuento = pedirDescuento();
        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        System.out.println("El precio final es: $" + precioFinal);
    }

    /**
     * Solicita al usuario que ingrese el precio de un producto y lo devuelve.
     * @return el precio del producto ingresado por el usuario como un valor de tipo double
     */
    private static double pedirPrecio() {
        while (true) {
            System.out.print("Ingrese el precio del producto: ");
            String entrada = sc.nextLine();

            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }

    /**
     * Solicita al usuario que ingrese el impuesto local y lo devuelve.
     * @return el impuesto local ingresado por el usuario como un valor de tipo double
     */
    private static double pedirImpuesto() {
        while (true) {
            System.out.print("Ingrese el impuesto en porcentaje: ");
            String entrada = sc.nextLine();

            try {
                double impuesto = Double.parseDouble(entrada);
                impuesto = Math.min(impuesto, 100)/100;
                return impuesto;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }

    /**
     * Solicita al usuario que ingrese el descuento y lo devuelve.
     * @return el descuento ingresado por el usuario como un valor de tipo double
     */
    private static double pedirDescuento() {
        while (true) {
            System.out.print("Ingrese el descuento en porcentaje: ");
            String entrada = sc.nextLine();

            try {
                double descuento = Double.parseDouble(entrada);
                descuento = Math.min(descuento, 100)/100;
                return descuento;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }

    /**
     * Calcula el precio final de un producto con impuesto y descuento.
     * @param precio Precio del producto.
     * @param impuesto Impuesto local.
     * @param descuento Descuento.
     * @return El precio final del producto.
     */
    private static double calcularPrecioFinal(double precio, double impuesto, double descuento) {
        return precio + (precio * impuesto) - (precio * descuento);
    }
}
