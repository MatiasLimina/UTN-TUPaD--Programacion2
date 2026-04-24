package Ejercicio_08;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "juan@email.com");
        Documento doc = new Documento("Ejemplo","Contenido","22AS433X","22/3/27",usuario);
        System.out.println(doc);
    }
}
