import java.util.Scanner;
public class Ejercicio_07 {
//    import java.util.Scanner;
//    public class ErrorEjemplo {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Ingresa tu nombre: ");
//            String nombre = scanner.nextInt();
// ERROR System.out.println("Hola, " + nombre);
    // El error se encuentra en "scanner.nextInt()", se deberia utilizar "nextLine()", ya que el metodo utilizado busca un entero
//        }
//    }
    // SOLUCION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
        sc.close();
    }
}
