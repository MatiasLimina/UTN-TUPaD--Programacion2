package Ejercicio_04;

public class Gato extends  Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + getNombre() + " dice: ¡Miau miau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este es un gato llamado " + getNombre() + ". Es un animal independiente y ágil.");
    }

}
