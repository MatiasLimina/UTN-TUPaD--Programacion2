public class Producto {
    private final int codigo;
    private String descripcion;
    private String categoria;
    private int cantStock;
    private double precioUnitario;
    static int totalProductos = 0;
    static final String[] CATEGORIAS_PERMITIDAS = {"Electronica","Libreria","Indumentaria","Hogar"};

    public Producto(String descripcion, String categoria, int cantStock, double precioUnitario){
        setDescripcion(descripcion);
        setCategoria(categoria);
        setCantStock(cantStock);
        setPrecioUnitario(precioUnitario);
        totalProductos ++;
        codigo = totalProductos;
    }
    public Producto(String descripcion, String categoria,int cantStock){
        this(descripcion,categoria,cantStock,50);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()){
            System.out.println("La descripcion no puede estar vacia");
            this.descripcion = "Sin descripcion";
        }else{
            this.descripcion = descripcion;
        }

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isBlank()){
            throw new IllegalArgumentException("La categoria no puede estar vacia");
        }else{
            for (String n : CATEGORIAS_PERMITIDAS){
                if (categoria.equalsIgnoreCase(n)){
                    this.categoria = categoria;
                    return;
                }
            }
            System.out.println("La categoria no se encuentra dentro de las permitidas por el sistema");
            this.categoria = "Sin categoria";
        }
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        if (cantStock < 0){
            System.out.println("El stock no puede ser menor a 0");
            this.cantStock = 0;
        }else{
            this.cantStock = cantStock;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0){
            System.out.println("El precio unitario no puede ser negativo");
            this.precioUnitario = 0;
        }else{
            this.precioUnitario = precioUnitario;
        }
    }

    public void aplicarDescuento(double porcentaje){
        if (porcentaje < 0){
            System.out.println("El descuento no puede ser negativo");
        }else{
            double descuento = porcentaje / 100;
            if (precioUnitario - (precioUnitario*descuento) < 0) {
                System.out.println("El precio unitario no puede ser menor a 0");

            }else{
                precioUnitario = precioUnitario - (precioUnitario*descuento);
            }
        }
    }
    public void aplicarDescuento(int descuento){
        if (descuento < 0){
            System.out.println("El descuento no puede ser negativo");
        }else if(precioUnitario - descuento < 0){
            System.out.println("El precio unitario no puede ser menor a 0");
        }else{
            precioUnitario -= descuento;
        }
    }
}
