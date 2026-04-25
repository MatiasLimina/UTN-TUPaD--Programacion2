package Ejercicio_13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codQR = new CodigoQR(valor, usuario);
        System.out.println("Generando QR: " + codQR);
    }

}
