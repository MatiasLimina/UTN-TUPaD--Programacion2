package Ejercicio_05;

public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni, Computadora computadora) {
        setNombre(nombre);
        setDni(dni);
        setComputadora(computadora);
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public Computadora getComputadora() {
        return computadora;
    }

    public void setNombre(String nombre) {
        if( nombre == null || nombre.isBlank() ){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
    }
    public void setDni(int dni) {
        if( dni < 0){
            System.out.println("El dni no puede ser negativo");
            this.dni = 00000000;
        }else {
            this.dni = dni;
        }
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if ( computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }
    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni + "Computadora=" + computadora.getMarca() +
                '}';
    }
}
