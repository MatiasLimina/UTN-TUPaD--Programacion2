package Ejercicio_03;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }
    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.isBlank()){
            System.out.println("La nacionalidad no puede estar vacia");
            this.nacionalidad = "Sin nacionalidad";
        }else{
            this.nacionalidad = nacionalidad;
        }
    }
    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }
}
