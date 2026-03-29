package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 02");
        System.out.println("Prueba de Errores:");
        Mascota mascotaErrores = new Mascota();
        mascotaErrores.setNombre("");
        mascotaErrores.setEspecie(null);
        mascotaErrores.setEdad(-1);
        mascotaErrores.mostrarInfo();

        System.out.println("Prueba de Funcionalidad:");
        Mascota mascota = new Mascota();
        mascota.setNombre("Firulais");
        mascota.setEspecie("Perro");
        mascota.setEdad(5);
        mascota.mostrarInfo();
        mascota.cumplirAños();
        mascota.mostrarInfo();
        mascota.cumplirAños();
        mascota.cumplirAños();
        mascota.cumplirAños();
        mascota.mostrarInfo();
        System.out.println("----------------------------------------");

    }
}
