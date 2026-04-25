package Ejercicio_14;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Ejemplo",120);
        EditorVideo editorVideo = new EditorVideo();
        editorVideo.exportar("mp4",proyecto);
    }
}
