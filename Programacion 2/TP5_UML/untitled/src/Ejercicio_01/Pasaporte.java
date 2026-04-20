package Ejercicio_01;

public class Pasaporte {
    private int numero;
    private int fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(int numero, int fechaEmision, Titular titular, String imagen, String formato) {
        setNumero(numero);
        setFechaEmision(fechaEmision);
        setTitular(titular);
        setFoto(imagen, formato);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0){
            System.out.println("El numero no puede ser negativo");
            this.numero = 0;
        }else{
            this.numero = numero;
        }
    }

    public int getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(int fechaEmision) {
        if (fechaEmision < 0){
            System.out.println("La fecha no puede ser negativa");
            this.fechaEmision = 000000;
        }else {
            this.fechaEmision = fechaEmision;
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        /**
        if (titular == null) {
            return;
        }
         */
        this.titular = titular;
        // Si el titular no conoce a este pasaporte, se lo asignamos
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(String imagen, String formato) {
        this.foto = new Foto(imagen, formato);
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero=" + numero +
                ", fechaEmision=" + fechaEmision +
                ", titularNombre='" + (titular != null ? titular.getNombre() : "null") + '\'' +
                ", foto=" + foto +
                '}';
    }
}
