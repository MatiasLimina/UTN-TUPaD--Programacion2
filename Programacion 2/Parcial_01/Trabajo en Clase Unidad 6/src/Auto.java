public class Auto extends Vehiculo {
    private int puertas;

    public Auto(int puertas,String marca, String modelo){
        super(marca,modelo);
        this.puertas = puertas;

    }

    @Override
    public void moverse() {
        System.out.println("El auto se esta moviendo");
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: "+ puertas);

    }
}
