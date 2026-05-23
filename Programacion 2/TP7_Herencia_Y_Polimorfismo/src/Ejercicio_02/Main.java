package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> listaFiguras = new ArrayList<>();
        /*
        Tarea: Crear un array de figuras y mostrar el área de cada una usando
        polimorfismo.
         */
        Circulo c1 = new Circulo("Circulo_1",2);
        Rectangulo r1 = new Rectangulo("Rectanguol_1",4,5);
        listaFiguras.add(c1);
        listaFiguras.add(r1);
        Circulo c2 = new Circulo("Circulo_2",3);
        listaFiguras.add(c2);
        Rectangulo r2 = new Rectangulo("Rectanguol_2",4,8);
        listaFiguras.add(r2);
        for (Figura f : listaFiguras) {
            System.out.println("Area de " + f.getNombre() + ": " + f.calcularArea());
        }
    }
}
