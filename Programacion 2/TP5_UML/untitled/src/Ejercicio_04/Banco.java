package Ejercicio_04;

public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        setNombre(nombre);
        setCuit(cuit);
    }
    public String getNombre() {
        return nombre;
    }
    public String getCuit() {
        return cuit;
    }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }
    public void setCuit(String cuit) {
        if( cuit == null || cuit.isBlank() ){
            System.out.println("El cuit no puede estar vacio");
            this.cuit = "Sin cuit";
        }else{
            this.cuit = cuit;
        }
    }
    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
}
