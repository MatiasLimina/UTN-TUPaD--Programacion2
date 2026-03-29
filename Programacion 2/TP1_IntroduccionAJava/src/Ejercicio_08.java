public class Ejercicio_08 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
        // Resultado es 2.5 pero java trunca el resultado y muestra 2.
        // Es una regla de java que al dividir enteros el resultado solo puede ser otro entero
    }
}
