import java.util.Scanner;

public class Ejercicio_11 {
    private static final Scanner sc = new Scanner(System.in);
    private static final double DESCUENTO_ESPECIAL = 0.10;
    public static void main(String[] args) {
        System.out.println("Ejercicio 11");
        double precio = solicitarPrecioProducto();
        System.out.println("El precio inicial del producto es: $" + precio);
        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El precio final del producto es: $" + precioFinal);
    }

    /**
     * Solicita al usuario que ingrese el precio de un producto, valida la entrada,
     * y asegura que sea un número mayor o igual a 0. Si el usuario ingresa un valor
     * inválido, se seguirá solicitando hasta que proporcione un valor válido.
     *
     * @return el precio del producto ingresado por el usuario como un valor de tipo double
     */
    private static double solicitarPrecioProducto(){
        while(true){
            System.out.println("Ingrese el precio del producto: ");
            String entrada = sc.nextLine();
            try{
                double precio = Double.parseDouble(entrada);
                if (precio >= 0){
                    return precio;
                }else {
                    System.out.println("Error: El precio debe ser mayor o igual a 0");
                }

            }catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido");
            }
        }
    }

    /**
     * Calcula el precio final de un producto aplicando un descuento especial definido
     * como un porcentaje fijo del precio inicial.
     *
     * @param precio el precio inicial del producto antes de aplicar el descuento
     * @return el precio final del producto después de aplicar el descuento especial
     */
    static double calcularDescuentoEspecial(double precio){
    double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
    System.out.println("El descuento aplicado es: $" + descuentoAplicado);
    return precio - descuentoAplicado;
}
}
