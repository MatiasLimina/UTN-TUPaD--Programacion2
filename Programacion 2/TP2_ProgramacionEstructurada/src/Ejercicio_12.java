import java.util.Scanner;
public class Ejercicio_12 {
    private static final Scanner sc = new Scanner(System.in);
    private static double[] precios ={200,150,540,335,125} ;
    public static void main(String[] args) {
        System.out.println("Ejercicio 12");
        System.out.println("Precios originales:");
        mostrarArray(precios);
        modificarPrecio(precios);
        System.out.println("Precios modificados:");
        mostrarArray(precios);
    }

    /**
     * Muestra los precios del arreglo en pantalla.
     * @param precios arreglo de precios
     */
    private static void mostrarArray(double[] precios) {
    for (double precio : precios) {
        System.out.println("Precio: $" + precio);
    }
    }

    /**
     * Solicita al usuario que ingrese un indice para modificar el precio del arreglo.
     * @return indice ingresado por el usuario.
     */
    private static int solicitarIndice(double[] precios) {
    int indice;
    while (true) {
        System.out.println("Seleccione el indice del precio a modificar:");
        String entrada = sc.nextLine();
        try {
            indice = Integer.parseInt(entrada);
            if (indice >= 0 && indice < precios.length) {
                return indice;
            } else {
                System.out.println("ERROR: indice no valido o fuera de rango");
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR: indice no valido, debe ser un numero entero");
        }
    }
    }

    /**
     * Solicita al usuario que ingrese un nuevo precio para el producto.
     * @return nuevo precio ingresado por el usuario.
     */
    private static double solicitarPrecio() {
        while (true) {
            System.out.println("Ingrese el nuevo precio:");
            String entrada = sc.nextLine();
            double nuevoPrecio;
            try {
                nuevoPrecio = Double.parseDouble(entrada);
                if (nuevoPrecio >= 0) {
                    return nuevoPrecio;
                }else{
                    System.out.println("ERROR: precio no valido o negativo, debe ser positivo");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: precio no valido, debe ser un numero");
            }
        }
    }
    /*
    private static double[] modificarPrecios(double[] precios) {
        int indice = solicitarIndice(precios);
        double nuevoPrecio = solicitarPrecio();
        precios[indice] = nuevoPrecio;
        return precios;
    }
    */

    /**
     * Modifica el precio del producto en el arreglo de precios.
     * @param precios arreglo de precios a modificar
     */
    private static void modificarPrecio(double[] precios) {
        int indice = solicitarIndice(precios);
        double nuevoPrecio = solicitarPrecio();
        precios[indice] = nuevoPrecio;
    }












}
