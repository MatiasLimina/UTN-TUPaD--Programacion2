package Ejercicio_06;

public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String  telefono) {
        setTelefono(telefono);
        setNombre(nombre);
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setNombre(String nombre) {
        if( nombre == null || nombre.isBlank() ){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
    }
    public void setTelefono(String telefono) {
        if ( telefono == null || telefono.isBlank() ){
            System.out.println("El telefono no puede estar vacio");
            this.telefono = "Sin telefono";
        }else {
            this.telefono = telefono;
        }
    }
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}
