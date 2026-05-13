package Ejercicio_01;

import java.util.Objects;

public class Producto {
    private final String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    private static int contador = 0;

    public Producto(String nombre, double precio,int cantidad, CategoriaProducto categoria) {
        this.id = "PROD-" + contador++;
        setNombre(nombre);
        setCantidad(cantidad);
        setPrecio(precio);
        this.categoria = categoria;
    }

    public Producto (String nombre, double precio,CategoriaProducto categoria){
        this(nombre,precio,0,categoria);
    }

    public Producto (String nombre, CategoriaProducto categoria){
        this(nombre,0,0,categoria);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0){
            System.out.println("El precio no puede ser negativo");
            this.precio = 0;
        }else{
            this.precio = precio;
        };
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0){
            System.out.println("La cantidad no puede ser negativa");
            this.cantidad = 0;
        }else {
            this.cantidad = cantidad;
        }
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoria: " + categoria.getDescripcion());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}
