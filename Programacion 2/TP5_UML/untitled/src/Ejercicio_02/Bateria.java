package Ejercicio_02;

public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        setModelo(modelo);
        setCapacidad(capacidad);
    }

    public String getModelo() {
        return modelo;
    }
    public int getCapacidad() {
        return capacidad;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("El modelo no puede estar vacio");
            this.modelo = "Sin modelo";
        }else{
            this.modelo = modelo;
        }
    }
    public void setCapacidad(int capacidad) {
        if (capacidad < 0){
            System.out.println("La capacidad no puede ser negativa");
            this.capacidad = 0;
        }else{
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        return "Bateria [modelo=" + modelo + ", capacidad=" + capacidad + "]";
    }
}
