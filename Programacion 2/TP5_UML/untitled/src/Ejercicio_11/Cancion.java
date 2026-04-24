package Ejercicio_11;

public class Cancion {
    String titulo;
    Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    public String getTitulo() {
        return titulo;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }

}
