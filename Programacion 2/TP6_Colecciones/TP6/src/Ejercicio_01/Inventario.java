package Ejercicio_01;

public class Inventario {
    private java.util.ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new java.util.ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (this.productos.contains(producto)) {
            System.out.println("El producto ya existe en el inventario.");
        } else {
            this.productos.add(producto);
        }
    }

    public void eliminarProducto(String id) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                productos.remove(p);
                encontrado = true;
                System.out.println("Producto eliminado");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el producto");
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                System.out.println("Producto encontrado:");
                return p;
            }
        }
        return null;
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        if (nuevaCantidad < 0) {
            System.out.println("ERROR: La cantidad no puede ser negativa, operación abortada");
            return;
        }
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.setCantidad(nuevaCantidad);
            }
        }
    }

    public void listarProductos () {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("----------------------");
            for (Producto p : productos) {
                p.mostrarInfo();
                System.out.println("----------------------");
            }
        }
        }
        public void filtrarPorCategoria(CategoriaProducto categoria) {
            if (productos.isEmpty()) {
                System.out.println("El inventario está vacío.");
            } else {
                System.out.println("Productos de la categoría " + categoria.getDescripcion() + ":");
                for (Producto p : productos) {
                    if (p.getCategoria().equals(categoria)) {
                        p.mostrarInfo();
                        System.out.println("----------------------");
                    }
                }
            }
        }
        public int obtenerTotalStock(){
            int total = 0;
            for (Producto p : productos) {
                total += p.getCantidad();
            }
            return  total;
        }

        public Producto obtenerProductoConMayorStock(){
            Producto productoMayorStock = null;
            int mayorStock = 0;
            for (Producto p : productos) {
                if (p.getCantidad() > mayorStock) {
                    mayorStock = p.getCantidad();
                    productoMayorStock = p;
                }

            }
            return productoMayorStock;
        }

        public void filtrarProductoPorPrecio(double min, double max){
            if (productos.isEmpty()) {
                System.out.println("El inventario está vacío.");
            } else {
                System.out.println("Productos con precio entre " + min + " y " + max + ":");
                for (Producto p : productos) {
                    if (p.getPrecio() >= min && p.getPrecio() <= max) {
                        p.mostrarInfo();
                        System.out.println("----------------------");
                    }
                }
            }
        }

        public void mostrarCategoriasDisponibles(){
            System.out.println("Categorias disponibles:");
            for (CategoriaProducto categoria : CategoriaProducto.values()) {
                System.out.println(categoria +": "+categoria.getDescripcion());
            }
        }
}
