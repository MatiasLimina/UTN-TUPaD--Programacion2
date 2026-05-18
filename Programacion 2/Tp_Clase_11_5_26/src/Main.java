//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro libro = null;
        try {
            libro = new Libro("Pepe", 13);
        } catch (StockInsuficienteException e) {
            System.out.println("ERROR: El stock no puede ser negativo.");
        }

        Revista revista = null;
        try {
            revista = new Revista("Pipo", 10);
        } catch (StockInsuficienteException e) {
            System.out.println("ERROR: El stock no puede ser negativo.");
        }
        Libro libro1 = null;
        try {
             libro1 = new Libro("Papa", -2);
        } catch (StockInsuficienteException e) {
            System.out.println("ERROR: El stock no puede ser negativo.");
        }


        System.out.println(libro);
        System.out.println(revista);
        try {
            libro.prestar();
        } catch (PrestamoInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }
        try {
            libro.reservar();
        } catch (PrestamoInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }

        try {
            revista.prestar();
        } catch (PrestamoInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }
        try {
            revista.reservar();
        } catch (PrestamoInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }
    }
}