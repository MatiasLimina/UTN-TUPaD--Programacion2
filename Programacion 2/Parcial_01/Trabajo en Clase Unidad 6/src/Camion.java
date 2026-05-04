public class Camion extends Vehiculo{
    private double capacidadCarga;

    public Camion (double capacidadCarga,String marca,String modelo){
        super(marca,modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void moverse() {
        System.out.println("El camion se esta moviendo");
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }
}
