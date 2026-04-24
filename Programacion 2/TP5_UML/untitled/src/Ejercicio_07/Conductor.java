package Ejercicio_07;

import javax.swing.text.AsyncBoxView;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor (String nombre, String licencia, Vehiculo vehiculo){
        setLicencia(licencia);
        setNombre(nombre);
        setVehiculo(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if ( nombre == null || nombre.isBlank() ){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        if ( licencia == null || licencia.isBlank() ){
            System.out.println("La licencia no puede estar vacia");
            this.licencia = "Sin licencia";
        }else {
            this.licencia = licencia;
        }
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", licencia='" + licencia + '\'' +
                ", vehiculo=" + vehiculo.getPatente() +
                '}';
    }
}
