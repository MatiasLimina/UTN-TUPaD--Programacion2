package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Michi"),
            new Vaca("Lola")
        };

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("-----------------------------------");
        }
    }

}
