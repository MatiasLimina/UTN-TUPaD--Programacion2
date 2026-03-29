import java.util.Scanner;
public class Ejercicio_03 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese su nombre... ");
    String nombre = sc.nextLine();
    System.out.println("Ingrese su edad... ");
    int edad = Integer.parseInt(sc.nextLine());
    System.out.println("Su nombre es "+nombre+" y su edad es "+edad);
    sc.close();
    }
}
