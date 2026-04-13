package Ejercicio_02;

public class SistemaRegistroLibros {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    /*
    1.- Constructor por defecto
    2.- Constructor con titulo y autor, editorial por defecto
     */
    public SistemaRegistroLibros(String titulo, String autor, String editorial)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    public SistemaRegistroLibros(String titulo, String autor){
        this(titulo, autor, editorial);
    }
    /*
    Setter y Getter
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty() || titulo.equals("null")) {
            System.out.println("ERROR: El titulo no puede ser nulo o estar vacio");
        }else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty() || autor.equals("null")) {
            System.out.println("ERROR: El autor no puede ser nulo o estar vacio");
        }else {
            this.autor = autor;
        }
    }

    public void actualizarTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty() || titulo.equals("null")) {
            System.out.println("ERROR: El titulo no puede ser nulo o estar vacio");
        }else {
            this.titulo = titulo;
        }
    }
    public void actualizarTitulo(String titulo, String prefijo){
        if (prefijo == null || prefijo.isEmpty() || prefijo.equals("null")) {
            System.out.println("ERROR: El prefijo no puede ser nulo o estar vacio");
        }else {
            actualizarTitulo(prefijo + " " + titulo);
        }
    }
    public static void cambiarEditorial(String nuevaEditorial) {
        if (nuevaEditorial != null && !nuevaEditorial.isEmpty()) {
            editorial = nuevaEditorial;
        } else {
            System.out.println("ERROR: La editorial no puede estar vacía.");
        }
    }

    @Override
    public String toString() {
        return "SistemaRegistroLibros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
