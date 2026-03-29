import java.util.Scanner;
public class Ejercicio_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(sc.nextLine());

        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        int division = num1/num2;
        System.out.println("La suma de "+num1+" y "+num2+"  es: "+ suma );
        System.out.println("La resta de "+num1+" y "+num2+"  es: "+ resta );
        System.out.println("La multiplicacion de "+num1+" y "+num2+"  es: "+ multiplicacion );
        System.out.println("La division de "+num1+" y "+num2+"  es: "+ division );
        sc.close();
    }
}
