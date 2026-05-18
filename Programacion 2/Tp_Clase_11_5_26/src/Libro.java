import java.util.concurrent.TransferQueue;

public class Libro extends MaterialBiblioteca implements Prestable, Reservable {
    private boolean prestado = false;
    public Libro(String titulo, int stock){
        setTitulo(titulo);
        setStock(stock);
    }

    @Override
    public void prestar() throws PrestamoInvalidoException {
        if(prestado){
            throw new PrestamoInvalidoException("ERROR: El libro ya ha sido prestado.");
        }
        System.out.println("El libro ha sido prestado.");
        prestado = true;
    }

    @Override
    public void reservar() throws PrestamoInvalidoException {
        if(prestado){
             throw new PrestamoInvalidoException("ERROR: El libro ya ha sido prestado.");
         }
        System.out.println("El libro ha sido reservado.");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", stock=" + stock +
                '}';
    }
}
