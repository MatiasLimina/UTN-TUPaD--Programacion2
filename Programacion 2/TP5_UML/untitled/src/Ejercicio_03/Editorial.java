package Ejercicio_03;

public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        setNombre(nombre);
        setDireccion(direccion);
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }
    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isBlank()){
            System.out.println("La direccion no puede estar vacia");
            this.direccion = "Sin direccion";
        }else{
            this.direccion = direccion;
        }
    }
    @Override
    public String toString() {
        return "Editorial [nombre=" + nombre + ", direccion=" + direccion + "]";
    }
}
