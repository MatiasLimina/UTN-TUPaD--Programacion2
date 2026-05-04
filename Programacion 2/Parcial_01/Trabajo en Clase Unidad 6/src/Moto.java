public class Moto extends Vehiculo{
    private boolean tieneCasco;

    public Moto(boolean tieneCasco,String marca,String modelo){
        super(marca, modelo);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void moverse() {
        System.out.println("La moto se esta moviendo");
    }

    public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene casco: "+tieneCasco);
    }
}
