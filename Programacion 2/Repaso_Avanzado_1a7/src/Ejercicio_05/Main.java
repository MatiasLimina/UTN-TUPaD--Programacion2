package Ejercicio_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static String validarNombre(String nombre){
        while (true){
            if (nombre == null || nombre.isBlank()){
                System.out.println("ERROR: el nombre no puede estar vacio");
                System.out.println("Ingrese un nombre: ");
                nombre = sc.nextLine();
            }else{
                System.out.println("Ingreso correcto");
                return nombre;
            }
        }
    }
    public static int validarEdad(int edad){
        while (true){
            if(edad < 0){
                System.out.println("ERROR: la edad debe ser mayor a 0");
                System.out.println("Ingrese una edad valida: ");
                edad = Integer.parseInt(sc.nextLine());
            }else{
                System.out.println("Ingreso correcto");
                return edad;
            }
        }
    }
   public static void mostrarPromedio(List<Estudiante> listaEstudiantes){
        System.out.println("El promedio de las notas es: " + calcularPromedio(listaEstudiantes));
    }
    public static double calcularPromedio(List<Estudiante> listaEstudiantes){
        int suma = 0;
        for (Estudiante e : listaEstudiantes) {
            suma += e.getNota();
        }
        if(listaEstudiantes.isEmpty()){
            return 0;
        }
        double promedio = (double) suma / listaEstudiantes.size();
        return  promedio;
    }

    public static void cantAprobados(List<Estudiante> listaEstudiantes){
        int cantAprobados = 0;
        for (Estudiante e : listaEstudiantes){
            if (e.getNota() >= 6){
                cantAprobados++;
            }
        }
        System.out.println("La cantidad de estudiantes aprobados es: " + cantAprobados);
    }
    public static int validarNota(int nota){
        while (true){
            if(nota < 0 || nota > 10){
                System.out.println("ERROR: la nota debe estar entre 0 y 10");
                System.out.println("Ingrese una nota valida: ");;
                nota = Integer.parseInt(sc.nextLine());
            }else{
                System.out.println("Ingreso correcto");
                return nota;
            }
        }
    }

    public static void añadirAlumno(List<Estudiante> listaEstudiantes, Estudiante estudiante){
        for (Estudiante e : listaEstudiantes){
           if (listaEstudiantes.contains(estudiante)){
               System.out.println("El estudiante ya existe");
               return;
           }
        }
        listaEstudiantes.add(estudiante);
    }

    public static void busquedaPorNombre(List<Estudiante> listaEstudiantes, String nombreBusqueda) {
        boolean encontrado = false;

        for (Estudiante e : listaEstudiantes) {

            if (e.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Estudiante " + e.getNombre() + " encontrado");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El estudiante " + nombreBusqueda + " no existe");
        }
    }

    public static void estudiantesEncimaPromedio(List<Estudiante> listaEstudiantes, double promedio){
        List <Estudiante> encimaPromedio = new ArrayList<Estudiante>();
        for (Estudiante e : listaEstudiantes){
            if (e.getNota() > promedio){
                encimaPromedio.add(e);
            }
        }
        if (encimaPromedio.isEmpty()){
            System.out.println("Ningun estudiante tiene nota superior al promedio");
        }else{
            System.out.println("Estudiantes con nota superior al promedio");
            for (Estudiante e : encimaPromedio){
                System.out.println(e);
            }
        }

    }

    public static void menu (List<Estudiante> listaEstudiantes){
        while (true){
            System.out.println("Ingrese una opcion:");
            System.out.println("1) Ingresar estudiante");
            System.out.println("2) Mostrar estudiantes");
            System.out.println("3) Añadir alumno");
            System.out.println("4) Busqueda por nombre");
            System.out.println("5) Alumnos por encima del promedio");
            System.out.println("6) Salir");
            String opcion = sc.nextLine();
            switch (opcion){
                    case "1":{
                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    nombre = validarNombre(nombre);
                    System.out.println("Ingrese la edad: ");
                    int edad = Integer.parseInt(sc.nextLine());
                    edad = validarEdad(edad);
                    System.out.println("Ingrese la nota: ");
                    int nota = Integer.parseInt(sc.nextLine());
                    nota = validarNota(nota);
                    Estudiante estudiante = new Estudiante(nombre, edad, nota);
                    System.out.println(estudiante);
                    listaEstudiantes.add(estudiante);
                    break;}
                    case "2":{
                    for (Estudiante e : listaEstudiantes) {
                        System.out.println(e);
                    }
                    break;}
                    case "3":{
                        System.out.println("Ingrese el nombre: ");
                        String nombre = sc.nextLine();
                        nombre = validarNombre(nombre);
                        System.out.println("Ingrese la edad: ");
                        int edad = Integer.parseInt(sc.nextLine());
                        edad = validarEdad(edad);
                        System.out.println("Ingrese la nota: ");
                        int nota = Integer.parseInt(sc.nextLine());
                        nota = validarNota(nota);
                        Estudiante estudiante = new Estudiante(nombre, edad, nota);
                        System.out.println(estudiante);
                        añadirAlumno(listaEstudiantes,estudiante);
                        break;}
                    case "4":{
                        System.out.println("Ingrese el nombre: ");
                        String nombre = sc.nextLine();
                        nombre = validarNombre(nombre);
                        busquedaPorNombre(listaEstudiantes,nombre);
                        break;}
                    case "5":{
                        estudiantesEncimaPromedio(listaEstudiantes,calcularPromedio(listaEstudiantes));
                        break;
                    }
                    case "6":{
                    mostrarPromedio(listaEstudiantes);
                    cantAprobados(listaEstudiantes);
                    System.out.println("Saliendo...");
                    return;}

            }
        }
    }

    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        Estudiante e1 = new Estudiante("Raul",20,2);
        Estudiante e2 = new Estudiante("Pepe",45,8);
        Estudiante e3 = new Estudiante("Maria",32,10);
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        menu(listaEstudiantes);
    }




}
