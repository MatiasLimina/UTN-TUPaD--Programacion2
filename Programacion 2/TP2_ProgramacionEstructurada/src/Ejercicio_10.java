import java.util.Scanner;

public class Ejercicio_10 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        int stockActual = solicitarStockActual();
        int cantidadVendida = solicitarCantidadVendida();
        int cantidadRecibida = solicitarCantidadRecibida();
        System.out.println("El stock actual es: " + stockActual);
        System.out.println("La cantidad vendida es: " + cantidadVendida);
        System.out.println("La cantidad recibida es: " + cantidadRecibida);
        int stockActualizado = actualizarStock(cantidadVendida, cantidadRecibida, stockActual);
        System.out.println("El stock actualizado es: " + stockActualizado);
    }

    /**
     * Solicita al usuario que ingrese el stock actual del producto y lo devuelve.
     * @return el stock del producto como un valor entero.
     */
    private static int solicitarStockActual(){
        while(true){
            System.out.println("Ingrese el stock actual del producto: ");
            String entrada = sc.nextLine();
            try{
                int stockActual = Integer.parseInt(entrada);
                if (stockActual >= 0){
                    return stockActual;
                }else {
                    System.out.println("Error: El stock debe ser mayor o igual a 0");
                }

            }catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido");
            }
        }
    }

    /**
     * Solicita al usuario que ingrese la cantidad vendida del producto y lo devuelve.
     * @return la cantidad vendida del producto como un valor entero.
     */
    private static int solicitarCantidadVendida(){
        while(true){
            System.out.println("Ingrese la cantidad vendida del producto: ");
            String entrada = sc.nextLine();
            try{
                int cantidadVendida = Integer.parseInt(entrada);
                if (cantidadVendida >= 0){
                    return cantidadVendida;
                }else {
                    System.out.println("Error: La cantidad vendida debe ser mayor o igual a 0");
                }

            }catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido");
            }
        }
    }

    /**
     * Solicita al usuario que ingrese la cantidad recibida del producto y lo devuelve.
     * @return la cantidad recibida del producto como un valor entero.
     */
    private static int solicitarCantidadRecibida(){
        while(true){
            System.out.println("Ingrese la cantidad recibida del producto: ");
            String entrada = sc.nextLine();
            try{
                int cantidadRecibida = Integer.parseInt(entrada);
                if (cantidadRecibida >= 0){
                    return cantidadRecibida;
                }else {
                    System.out.println("Error: La cantidad recibida debe ser mayor o igual a 0");
                }

            }catch(NumberFormatException e){
                System.out.println("Error: Ingrese un número válido");
            }
        }
    }

private static int actualizarStock(int cantidadVendida, int cantidadRecibida, int stockActual){
        int stockActualizado = 0;
        stockActualizado = stockActual + cantidadVendida - cantidadRecibida;
        if (stockActualizado < 0){
            System.out.println("Error: El stock actualizado es negativo. Verifique los datos ingresados.");
            System.out.println("El stock no sera modificado");
            return stockActual;
        }else {
            return stockActualizado;
        }
    }
}
