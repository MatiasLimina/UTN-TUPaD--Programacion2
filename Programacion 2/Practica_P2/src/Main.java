import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Crear 3 géneros
        Genero fantasia = new Genero("Fantasía", "Libros con elementos mágicos o sobrenaturales");
        Genero cienciaFiccion = new Genero("Ciencia Ficción", "Libros sobre tecnología futurista y viajes espaciales");
        Genero terror = new Genero("Terror", "Libros diseñados para causar miedo o suspenso");

        // 2. Crear 6 libros (2 por cada género)
        Libro libroF1 = new Libro("El Señor de los Anillos", 25.50, "J.R.R. Tolkien", 10, fantasia);
        Libro libroF2 = new Libro("Harry Potter y la Piedra Filosofal", 20.00, "J.K. Rowling", 15, fantasia);
        fantasia.agregarLibro(libroF1);
        fantasia.agregarLibro(libroF2);

        Libro libroCF1 = new Libro("Dune", 30.00, "Frank Herbert", 8, cienciaFiccion);
        Libro libroCF2 = new Libro("1984", 18.00, "George Orwell", 12, cienciaFiccion);
        cienciaFiccion.agregarLibro(libroCF1);
        cienciaFiccion.agregarLibro(libroCF2);

        Libro libroT1 = new Libro("El Resplandor", 22.00, "Stephen King", 5, terror);
        Libro libroT2 = new Libro("Drácula", 15.00, "Bram Stoker", 20, terror);
        terror.agregarLibro(libroT1);
        terror.agregarLibro(libroT2);

        // 3. Crear 2 clientes (con Rol diferente)
        Cliente admin = new Cliente("Admin", Rol.ADMIN, "123456789", "admin123", "Super", "admin@test.com");
        Cliente cliente = new Cliente("Juan", Rol.CLIENTE, "987654321", "juan123", "Pérez", "juan@test.com");

        // 4. Crear 4 pedidos (2 por cada cliente)
        Pedido pedidoA1 = new Pedido(LocalDate.now(), Estado.PENDIENTE, FormaPago.EFECTIVO, admin);
        Pedido pedidoA2 = new Pedido(LocalDate.now(), Estado.CONFIRMADO, FormaPago.TARJETA, admin);
        admin.agregarPedido(pedidoA1);
        admin.agregarPedido(pedidoA2);

        Pedido pedidoC1 = new Pedido(LocalDate.now(), Estado.PENDIENTE, FormaPago.TRANSFERENCIA, cliente);
        Pedido pedidoC2 = new Pedido(LocalDate.now(), Estado.TERMINADO, FormaPago.EFECTIVO, cliente);
        cliente.agregarPedido(pedidoC1);
        cliente.agregarPedido(pedidoC2);

        // 5. Crear 12 detalles de pedido (3 por cada pedido)
        // Obligatorio: Los detalles deben crearse usando addDetallePedido
        pedidoA1.addDetallePedido(2, libroF1.getPrecio(), libroF1);
        pedidoA1.addDetallePedido(1, libroCF1.getPrecio(), libroCF1);
        pedidoA1.addDetallePedido(3, libroT1.getPrecio(), libroT1);

        pedidoA2.addDetallePedido(1, libroF2.getPrecio(), libroF2);
        pedidoA2.addDetallePedido(2, libroCF2.getPrecio(), libroCF2);
        pedidoA2.addDetallePedido(1, libroT2.getPrecio(), libroT2);

        pedidoC1.addDetallePedido(3, libroF1.getPrecio(), libroF1);
        pedidoC1.addDetallePedido(1, libroF2.getPrecio(), libroF2);
        pedidoC1.addDetallePedido(2, libroCF1.getPrecio(), libroCF1);

        pedidoC2.addDetallePedido(1, libroCF2.getPrecio(), libroCF2);
        pedidoC2.addDetallePedido(2, libroT1.getPrecio(), libroT1);
        pedidoC2.addDetallePedido(4, libroT2.getPrecio(), libroT2);

        // 6. Calcular el total de cada pedido con calcularTotal()
        pedidoA1.calcularTotal();
        pedidoA2.calcularTotal();
        pedidoC1.calcularTotal();
        pedidoC2.calcularTotal();

        System.out.println("Total Pedido A1: " + pedidoA1.getTotal());
        System.out.println("Total Pedido A2: " + pedidoA2.getTotal());
        System.out.println("Total Pedido C1: " + pedidoC1.getTotal());
        System.out.println("Total Pedido C2: " + pedidoC2.getTotal());
    }
}
