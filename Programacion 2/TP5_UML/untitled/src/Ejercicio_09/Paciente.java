package Ejercicio_09;

public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    public String getNombre() {
        return nombre;
    }
    public String getObraSocial() {
        return obraSocial;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
}
