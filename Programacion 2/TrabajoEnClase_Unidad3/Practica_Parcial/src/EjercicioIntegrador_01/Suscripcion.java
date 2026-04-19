package EjercicioIntegrador_01;

public class Suscripcion {
    private final int numeroSocio;
    private String cliente;
    private int mesesPagados;
    private double tarifaMensual;
    static int totalSuscripciones = 0;

    public Suscripcion(String cliente, int mesesPagados, double tarifaMensual) {
        this.cliente = cliente;
        this.mesesPagados = mesesPagados;
        this.tarifaMensual = tarifaMensual;
        totalSuscripciones ++;
        numeroSocio = totalSuscripciones;
    }
    public Suscripcion(String cliente){
        this(cliente,1,25000);
    }

}
