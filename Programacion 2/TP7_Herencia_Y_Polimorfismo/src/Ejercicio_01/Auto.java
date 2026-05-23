package Ejercicio_01;

public class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca,modelo);
        this.cantPuertas = cantPuertas;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantPuertas);
    }

}
