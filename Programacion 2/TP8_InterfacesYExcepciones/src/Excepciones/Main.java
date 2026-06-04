package Excepciones;

import java.io.*;
import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Consigna 1
         */
        while (true) {
            System.out.println("Ingrese 2 numeros para realizar una division");
            System.out.print("Ingrese el primer numero: ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese el segundo numero: ");
            int num2 = Integer.parseInt(sc.nextLine());
            try {
                System.out.println("El resultado de la division entre "+num1+" y "+num2+" es: "+(num1/num2));
                break;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por 0");
            }
        }

        /*
        Consigan 2
         */
        while (true) {
            System.out.println("Ingrese un numero");
            String n = sc.nextLine();
            try {
                int n_entero = Integer.parseInt(n);
                break;
                } catch (NumberFormatException e) {
                System.out.println("No es un numero");
            }
        }

        /*
        Consigna 3
         */
        try{
            BufferedReader archivo_3 = new BufferedReader(new FileReader("TP8.txt"));
            System.out.println(archivo_3.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");;
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }

        /*
        Consigna 4
         */
        while (true) {
            System.out.println("Ingrese su edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            try {
                if (edad < 0 || edad > 120) {
                    throw new EdadInvalidaException("La edad no puede ser menor a 0 o mayor a 120");
                }
                break;
            }catch (EdadInvalidaException e){
                System.out.println(e.getMessage());
            }
        }
        /*
        Consigna 5
         */
        try(BufferedReader archivo_5 = new BufferedReader(new FileReader("TP8.txt"))) {
            String linea;
            while ((linea = archivo_5.readLine()) != null) {
                System.out.println(linea);
                }
        }catch (IOException e) {
            System.out.println("No se encontro el archivo");

        }


    }
}
