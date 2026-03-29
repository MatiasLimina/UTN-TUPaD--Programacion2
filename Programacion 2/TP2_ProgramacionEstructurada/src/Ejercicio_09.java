import java.util.Scanner;
public class Ejercicio_09 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 09");
        double pesoPaquete = solicitarPesoPaquete();
        String zonaEnvio = solicitarZonaEnvio();
        double precioProducto = precioProducto();
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo de envio es: $" + costoEnvio);
        System.out.println("El total de la compra es: $" + totalCompra);
    }

    /**
     * Solicita al usuario que ingrese el peso del paquete y lo devuelve.
     * @return el peso del paquete ingresado por el usuario como un valor de tipo double
     */
    private static double solicitarPesoPaquete() {
        while (true) {
            System.out.print("Ingrese el peso del paquete en kilogramos:");
            String entrada = sc.nextLine();

            try {
                double peso = Double.parseDouble(entrada);
                if (peso <= 0) {
                    System.out.println("El peso debe ser mayor que cero.");
                }else{
                    return peso;
                }
            }catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }

    /**
     * Solicita al usuario que ingrese la zona de envio y la devuelve.
     * @return la zona de envio ingresada por el usuario como un valor de tipo String
     */
    private static String solicitarZonaEnvio() {
        boolean esZona = false;
        String zona = "";
        while (!esZona) {
            System.out.println("Ingrese la zona de envio (A: Internacional, B:Nacional)");
            zona = sc.nextLine();
            zona = zona.toUpperCase();
            if (zona.equals("A") || zona.equals("B")) {
                esZona = true;
            } else {
                System.out.println("Error: Debe ingresar A o B.");

            }
        }
        return zona;
    }

    /**
     * Solicita al usuario que ingrese el precio de un producto y lo devuelve.
     * Verifica que el precio sea un número positivo antes de retornarlo.
     * Si la entrada no es válida, solicita nuevamente el ingreso.
     * @return el precio del producto como un valor de tipo double
     */
    private static double precioProducto (){
        while (true) {
            System.out.print("Ingrese el precio del producto en pesos:");
            String entrada = sc.nextLine();

            try {
                double precio = Double.parseDouble(entrada);
                if (precio < 0) {
                    System.out.println("El precio debe ser mayor que cero.");
                }else{
                    return precio;
                }
            }catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }

    /**
     * Calcula el costo de envío basado en el peso del paquete y la zona de envío.
     * La zona "A" es internacional con un costo de 10 por kilogramo,
     * mientras que la zona "B" es nacional con un costo de 5 por kilogramo.
     *
     * @param peso el peso del paquete en kilogramos
     * @param zona la zona de envío ("A" para internacional, "B" para nacional)
     * @return el costo total de envío como un valor de tipo double
     */
    private static double calcularCostoEnvio(double peso, String zona) {
        /* A = Internacional(10xkg), B = Nacional(5xkg) */
        if (zona.equals("A")){
            return peso * 10;
        }else{
            return peso * 5;
        }
}

    /**
     * Calcula el total de la compra sumando el precio del producto y el costo de envío.
     *
     * @param precio el precio del producto como un valor de tipo double
     * @param costoEnvio el costo de envío como un valor de tipo double
     * @return el total de la compra como un valor de tipo double
     */
    private static double calcularTotalCompra(double precio, double costoEnvio){
        return precio + costoEnvio;
    }










}
