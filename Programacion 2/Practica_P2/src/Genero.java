import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Genero extends Base{
    private String nombre;
    private String descripcion;
    private List<Libro> libros;

    public Genero(String nombre, String descripcion, List<Libro> libros) {
        super(false, LocalDateTime.now());
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.libros = libros;
    }
    public Genero(String nombre, String descripcion) {
        this(nombre,descripcion,new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Libro> getLibros() {
        return Collections.unmodifiableList(this.libros);
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
        libro.setGenero(this);
    }

    @Override
    public String toString() {
        return "Genero{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", libros=" + libros + ", " +
                super.toString() + "}";
    }
}
