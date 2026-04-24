package Ejercicio_06;

public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        setCapacidad(capacidad);
        setNumero(numero);
    }
    public int getNumero() {
        return numero;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setNumero(int numero) {
        if (numero < 0){
            System.out.println("El numero no puede ser negativo");
            this.numero = 0;
        }else {
            this.numero = numero;
        }
    }
    public void setCapacidad(int capacidad) {
        if ( capacidad < 0 ){
            System.out.println("La capacidad no puede ser negativa");
            this.capacidad = 0;
        }else {
            this.capacidad = capacidad;
        }
    }
    @Override
    public String toString() {
        return "Mesa [numero=" + numero + ", capacidad=" + capacidad + "]";
    }
}
