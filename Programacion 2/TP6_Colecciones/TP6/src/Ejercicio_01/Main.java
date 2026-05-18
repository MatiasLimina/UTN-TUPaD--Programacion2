package Ejercicio_01;

public class Main {
    public static void main(String[] args) {

        // Creacion de 5 objetos, agregarlos al inventario y listarlos
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("Remera",25.30,30,CategoriaProducto.ROPA);
        Producto p2 = new Producto("Lampara",2456,5,CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("Sillon",1200.68,2,CategoriaProducto.HOGAR);
        Producto p4 = new Producto("Manzana",5,-5,CategoriaProducto.ALIMENTOS);
        Producto p5 = new Producto("Pantalon",45.9,10,CategoriaProducto.ROPA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        inventario.listarProductos();

        // Buscar por ID
        Producto pBuscado = inventario.buscarProductoPorId("PROD-4");
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        }else {
            System.out.println("No se encontro el producto");
        }
        // Filtrar por categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        //Eliminar un producto por su ID y listar los productos restantes.
        inventario.eliminarProducto("PROD-4");
        inventario.listarProductos();

        //Actualizar el stock de un producto existente.
        inventario.actualizarStock("PROD-3",50);
        inventario.listarProductos();
        //Mostrar el total de stock disponible.
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());
        //Obtener y mostrar el producto con mayor stock.
        System.out.println("Producto con la mayor cantidad de stock disponible: ");
        inventario.obtenerProductoConMayorStock().mostrarInfo();
        // Filtrar productos con precios entre $1000 y $3000.
        inventario.filtrarProductoPorPrecio(1000,3000);
        //Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
    }


}
