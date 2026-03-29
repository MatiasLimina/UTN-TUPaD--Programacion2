import java.util.Scanner;
public class Ejercicio_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el segundo número: ");
        double num2 = Double.parseDouble(sc.nextLine());

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        sc.close();
    }
}
