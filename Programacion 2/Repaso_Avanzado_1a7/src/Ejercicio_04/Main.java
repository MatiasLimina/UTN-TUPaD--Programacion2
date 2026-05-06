package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

/*
Autor -> Libro:
Elegi una asociacion bidireccional 1 : N por que el enunciado mismo representa la definicion de este caso,
son entidades separadas que pueden existir de manera independiente pero que se conocen entre si.

Biblioteca -> Libro:
La biblioteca actua como un contenedor y los libros son sus partes, sin embargo los libros pueden existir de manera
independiente a la biblioteca, lo que significa que si la biblioteca desaparece, los libros siguen existiendo.
 */




public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("PepitoAventuras",null);
        Libro libro2 = new Libro("Carreras",null);
        Libro libro3 = new  Libro("PepitoAventuras 2",null);
        List<Libro> listaLibros1 = new ArrayList<Libro>();
        listaLibros1.add(libro1);
        listaLibros1.add(libro2);
        listaLibros1.add(libro3);

        Autor autor1 = new Autor("Franco",listaLibros1);
        System.out.println(autor1);

        Libro libro4 = new Libro("PepitoAventuras3",null);
        autor1.addLibro(libro4);
        System.out.println(autor1);

        Biblioteca biblioteca = new Biblioteca(listaLibros1);
        System.out.println(biblioteca);
    }
}
