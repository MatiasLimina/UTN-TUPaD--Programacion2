public class Revista extends MaterialBiblioteca implements Prestable, Reservable {
    private boolean prestado = false;
    public Revista(String titulo, int stock){
        setTitulo(titulo);
        setStock(stock);
    }

    @Override
    public void prestar() throws PrestamoInvalidoException {
        if(prestado){
            throw new PrestamoInvalidoException("ERROR: La revista ya ha sido prestada.");
        }
        System.out.println("La revista ha sido prestada.");
        prestado = true;
    }

    @Override
    public void reservar() throws PrestamoInvalidoException {
        if(prestado){
            throw new PrestamoInvalidoException("ERROR: La revista ya ha sido prestada.");
        }
        System.out.println("La revista ha sido reservada.");
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + titulo + '\'' +
                ", stock=" + stock +
                '}';
    }
}
