package Ejercicio_01;

public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, int dni, Pasaporte pasaporte) {
        setNombre(nombre);
        setDni(dni);
        setPasaporte(pasaporte);
    }

    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }
    public void setDni(int dni) {
        if(dni < 0){
            System.out.println("El dni no puede ser negativo");
            this.dni = 00000000;
        }else{
            this.dni = dni;
        }
    }

    public void setPasaporte(Pasaporte pasaporte) {
        if (pasaporte == null) {
            return;
        }
        this.pasaporte = pasaporte;
        // Sincronización: le avisamos al pasaporte que este es su titular
        if (pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", N° pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "null") +
                '}';
    }
}
