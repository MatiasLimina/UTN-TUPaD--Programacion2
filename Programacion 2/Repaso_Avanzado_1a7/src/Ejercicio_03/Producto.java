package Ejercicio_03;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("ERROR: el nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;

        }
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio){
        if (precio < 0){
            System.out.println("ERROR: el precio no puede ser negativo");
            this.precio = 0;
        }else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
