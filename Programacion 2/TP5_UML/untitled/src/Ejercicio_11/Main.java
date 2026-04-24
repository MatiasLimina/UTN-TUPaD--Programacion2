package Ejercicio_11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Elvis Presley", "Pop");
        Cancion cancion = new Cancion("Burning love", artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}
