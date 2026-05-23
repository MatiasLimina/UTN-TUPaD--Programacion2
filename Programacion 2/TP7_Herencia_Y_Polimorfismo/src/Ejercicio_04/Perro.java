package Ejercicio_04;

public class Perro extends  Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + getNombre() + " dice: ¡Guau guau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este es un perro llamado " + getNombre() + ". Es un animal doméstico leal.");
    }

}
