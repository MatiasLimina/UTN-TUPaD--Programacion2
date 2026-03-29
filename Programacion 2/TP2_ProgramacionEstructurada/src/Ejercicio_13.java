import java.util.Scanner;
public class Ejercicio_13 {
    private static final Scanner sc = new Scanner(System.in);
    private static double[] precios ={200,150,540,335,125};
    public static void main(String[] args) {
        System.out.println("Ejercicio 13");
        System.out.println("Precios originales:");
        mostrarArrayRecursivo(precios,precios.length-1);
        modificarPrecio(precios);
        System.out.println("Precios modificados:");
        mostrarArrayRecursivo(precios,precios.length-1);
    }
    public static void mostrarArrayRecursivo(double[] array,int tamaño){
        if (tamaño == 0) {
            System.out.println("Precio: $" + array[tamaño]);
        }else {
        mostrarArrayRecursivo(array, tamaño - 1);
        System.out.println("Precio: $" + array[tamaño]);
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
