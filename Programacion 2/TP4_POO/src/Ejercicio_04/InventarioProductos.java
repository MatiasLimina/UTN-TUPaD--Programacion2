package Ejercicio_04;

public class InventarioProductos {
    private String nombre;
    private double  precioBase;
    private static double IVA = 0.21;

    public InventarioProductos(String nombre, double precioBase) {
        this.nombre = nombre;
        if (precioBase < 0) {
            System.out.println("ERROR: El precio no puede ser negativo.");
            System.out.println("Se asignara el valor por defecto: 100");
            this.precioBase = 100;
        }else {
            this.precioBase = precioBase;
        }
    }
    public InventarioProductos(String nombre) {
        this(nombre, 100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty() || nombre.equals("null")) {
            System.out.println("ERROR: El nombre no puede ser nulo o estar vacio");
        }else {
            this.nombre = nombre;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0){
            System.out.println("ERROR: El precio no puede ser negativo.");
        }else {
            this.precioBase = precioBase;
        }
    }

    public void aplicarDescuento(double descuento, double precioMinimo){
        double aux;
        if (descuento < 0 || descuento > 100) {
            System.out.println("ERROR: El descuento debe estar entre 0 y 100");
        }else{
            descuento = descuento/100;
            aux = precioBase - (precioBase * descuento);
            if (aux < precioMinimo) {
                System.out.println("El precio final no puede ser menor al precio minimo de: " + precioMinimo);
            }else {
                precioBase = aux;
            }
        }
    }
    public void aplicarDescuento(double descuento){
        aplicarDescuento(descuento, 0);
    }

}
