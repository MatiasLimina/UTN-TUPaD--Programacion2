package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Titular juan = new Titular("Juan Perez", 12345678, null);

        // 2. Creamos el Pasaporte (esto crea la Foto internamente por Composición)
        Pasaporte p1 = new Pasaporte(1001, 20260420,juan,"Sol","PNG");

        // 3. Vinculamos Pasaporte con Titular (Asociación Bidireccional)
        p1.setTitular(juan);

        // 4. Comprobamos que ambos se conocen
        System.out.println("Titular: " + juan.getNombre());
        System.out.println("Pasaporte del titular: " + juan.getPasaporte().getNumero());
        System.out.println("Dueño del pasaporte: " + p1.getTitular().getNombre());
        System.out.println("Formato de la foto del pasaporte: " + p1.getFoto().getFormato());
        System.out.println(p1);
        System.out.println(juan);
    }
}
