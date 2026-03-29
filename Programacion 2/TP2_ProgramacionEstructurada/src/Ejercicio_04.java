import java.util.Scanner;
public class Ejercicio_04 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 04");
        double precio = pedirPrecio();
        String categoria = pedirCategoria();
        double descuento = calcularDescuento(precio, categoria);
        mostrarResultado(descuento, precio, categoria);
    }

    /**
     * Solicita al usuario que ingrese el precio de un producto y lo devuelve.
     * @return el precio del producto ingresado por el usuario como un valor de tipo double
     */
    private static double pedirPrecio(){
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        return precio;
}

    /**
     * Solicita al usuario que ingrese la categoría de un producto y lo devuelve.
     * @return la categoría del producto ingresada por el usuario como un valor de tipo String
     */
    private static String pedirCategoria(){
        System.out.println("Ingrese la categoría del producto (A, B o C): ");
        String categoria = sc.nextLine();
        return categoria.toUpperCase();
}

    /**
     * Calcula el descuento aplicable según la categoría del producto.
     * @param precio el precio del producto
     * @param categoria la categoría del producto
     * @return el descuento aplicado como un valor de tipo double
     */
    private static double calcularDescuento(double precio, String categoria){
        categoria = categoria.toUpperCase();
        switch (categoria){
            case "A":
                return precio * 0.10;
            case "B":
                return precio * 0.20;
            case "C":
                return precio * 0.30;
            default:
                return 0;
        }
}

    /**
     * Muestra el resultado del cálculo del descuento aplicable, el precio original,
     * el porcentaje de descuento y el precio final basado en la categoría del producto.
     *
     * @param descuento el valor del descuento calculado según la categoría del producto
     * @param precio el precio original del producto
     * @param categoria la categoría del producto, que puede ser "A", "B" o "C"
     */
    private static void mostrarResultado(double descuento, double precio,String categoria){

        if (descuento == 0){
            System.out.println("No hay descuento aplicable");
            System.out.println("El precio original es: $" + precio);
            System.out.println("El descuento aplicado es: " + descuento);
            System.out.println("El precio final es: $" + (precio - descuento));

        }else if (categoria.equals("A")){
            System.out.println("El precio original es: $" + precio);
            System.out.println("El descuento aplicado es de 10%: " + descuento);
            System.out.println("El precio final es: $" + (precio - descuento));
        }else if (categoria.equals("B")){
            System.out.println("El precio original es: $" + precio);
            System.out.println("El descuento aplicado es de 20%: " + descuento);
            System.out.println("El precio final es: $" + (precio - descuento));
        }else if (categoria.equals("C")){
            System.out.println("El precio original es: $" + precio);
            System.out.println("El descuento aplicado es de 30%: " + descuento);
            System.out.println("El precio final es: $" + (precio - descuento));
        }
    }


}


