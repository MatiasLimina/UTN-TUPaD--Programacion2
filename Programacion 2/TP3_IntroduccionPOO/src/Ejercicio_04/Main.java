package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 04");
        System.out.println("Prueba de Errores:");
        Gallina gallinaErrores = new Gallina();
        gallinaErrores.setIdGallina(-1);
        gallinaErrores.setHuevosPuestos(0);
        gallinaErrores.setEdad(-1);
        gallinaErrores.mostrarInfo();
        gallinaErrores.envejecer();
        gallinaErrores.ponerHuevo(2);
        gallinaErrores.mostrarInfo();

        System.out.println("----------------------------------------");
        System.out.println("Gallina sin errores:");
        Gallina gallina = new Gallina();
        gallina.setIdGallina(1);
        gallina.setHuevosPuestos(0);
        gallina.setEdad(2);
        gallina.mostrarInfo();
        gallina.envejecer();
        gallina.ponerHuevo(4);
        gallina.mostrarInfo();
    }
}
