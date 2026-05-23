package Ejercicio_04;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public abstract void describirAnimal();

    public String getNombre() {
        return nombre;
    }

}
