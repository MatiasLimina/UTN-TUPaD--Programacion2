
import java.time.LocalDateTime;
import java.util.Objects;

public class Libro extends Base{
    private String titulo;
    private double precio;
    private String autor;
    private int stock;
    private String isbn;
    private boolean disponible;
    private Genero genero;

    public Libro(String titulo, double precio, String autor, int stock,boolean disponible,Genero genero) {
        super(false, LocalDateTime.now());
        setTitulo(titulo);
        setPrecio(precio);
        setAutor(autor);
        setStock(stock);
        this.isbn = String.valueOf(super.getId());
        this.genero = genero;
    }
    public Libro(String titulo, double precio, String autor, int stock,Genero genero){
        this(titulo,precio,autor,stock,true,genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", autor='" + autor + '\'' +
                ", stock=" + stock +
                ", isbn='" + isbn + '\'' +
                ", disponible=" + disponible +
                ", genero=" + (genero != null ? genero.getNombre() : "Ninguno")+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
