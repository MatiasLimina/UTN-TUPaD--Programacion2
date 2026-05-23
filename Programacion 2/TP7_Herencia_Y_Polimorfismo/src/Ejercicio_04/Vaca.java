package Ejercicio_04;

public class Vaca extends  Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca " + getNombre() + " dice: ¡Muuu!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este es una vaca llamada " + getNombre() + ". Es un animal rumiante que produce leche.");
    }


}
