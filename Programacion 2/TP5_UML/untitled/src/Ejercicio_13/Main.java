package Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "admin@email.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("QR_Prueba",usuario);
    }
}
