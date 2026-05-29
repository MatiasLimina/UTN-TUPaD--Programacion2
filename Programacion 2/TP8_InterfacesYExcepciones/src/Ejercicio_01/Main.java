package Ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un cliente (Notificable)
        Cliente cliente = new Cliente("Juan Pérez");

        // 2. Crear algunos productos (Pagable)
        Producto laptop = new Producto("Laptop Dell", 1200.0);
        Producto raton = new Producto("Ratón Inalámbrico", 25.0);
        Producto teclado = new Producto("Teclado Mecánico", 75.0);

        // 3. Crear un pedido para el cliente
        List<Producto> productosPedido = new ArrayList<>();
        productosPedido.add(laptop);
        productosPedido.add(raton);
        
        Pedido pedido = new Pedido(productosPedido, cliente);
        
        // Agregar un producto extra después de la creación
        System.out.println("\nAgregando producto al pedido...");
        pedido.agregarProducto(teclado);

        // 4. Calcular el total del pedido
        double totalPedido = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + totalPedido);

        // 5. Cambiar el estado del pedido (debería notificar al cliente)
        System.out.println("\nCambiando estado del pedido...");
        pedido.setEstado(EstadoPedido.EN_PROCESO);
        pedido.setEstado(EstadoPedido.ENTREGADO);

        // 6. Procesar el pago
        System.out.println("\nProcesando pagos...");
        Pago tarjeta = new TarjetaDeCredito();
        tarjeta.procesarPago(totalPedido);

        // Usar método específico de PagoConDescuento
        if (tarjeta instanceof PagoConDescuento) {
            ((PagoConDescuento) tarjeta).aplicarDescuento(totalPedido, 100.0);
        }

        System.out.println("\nProcesando pago con otro medio...");
        Pago paypal = new PayPal();
        paypal.procesarPago(totalPedido);
        
        if (paypal instanceof PagoConDescuento) {
            ((PagoConDescuento) paypal).aplicarDescuento(totalPedido, 50.0);
        }
        
        System.out.println("\nActualizando estado final...");
        pedido.setEstado(EstadoPedido.ENTREGADO);
    }
}
