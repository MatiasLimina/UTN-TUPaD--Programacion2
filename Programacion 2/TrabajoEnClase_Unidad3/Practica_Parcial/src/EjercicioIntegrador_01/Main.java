package EjercicioIntegrador_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pruebas de errores y robustez");
        System.out.println("Prueba 1");
        Suscripcion sus1 = new Suscripcion("Roberto",2,300);
        System.out.println(sus1);
        System.out.println(Suscripcion.getSuscripcionesActivas());
        sus1.renovarSuscripcion(5);
        System.out.println(sus1);
        System.out.println("----------------------------");
        System.out.println("Prueba 2");
        Suscripcion sus2 = new Suscripcion("Julian");
        System.out.println(sus2);
        sus2.renovarSuscripcion(-10);
        sus2.renovarSuscripcion(10000.20);
        sus2.renovarSuscripcion(5000000.5000);
        System.out.println(sus2);
        System.out.println("----------------------------");
        System.out.println("Prueba 3");
        Suscripcion sus3 = new Suscripcion("",-40,5000);
        System.out.println(sus3);
        System.out.println(Suscripcion.getSuscripcionesActivas());
        sus3.renovarSuscripcion(-5000.23);
        System.out.println(sus3);
        sus3.renovarSuscripcion(500.0);
        System.out.println(sus3);
        sus3.renovarSuscripcion(2);
        System.out.println(sus3);
    }
}
