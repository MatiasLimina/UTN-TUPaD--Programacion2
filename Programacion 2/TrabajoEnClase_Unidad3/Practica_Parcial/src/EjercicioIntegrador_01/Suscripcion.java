package EjercicioIntegrador_01;

public class Suscripcion {
    private final int numeroSocio;
    private String cliente;
    private int mesesPagados;
    private double tarifaMensual;
    static int totalSuscripciones = 0;

    public Suscripcion(String cliente, int mesesPagados, double tarifaMensual) {
        setCliente(cliente);
        setMesesPagados(mesesPagados);
        setTarifaMensual(tarifaMensual);
        totalSuscripciones ++;
        numeroSocio = totalSuscripciones;
    }
    public Suscripcion(String cliente){
        this(cliente,1,25000);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.isBlank()){
            System.out.println("ERROR: el nombre de cliente no puede estar vacio");
            this.cliente = "Sin nombre";
        }else{
            this.cliente = cliente;
        }
    }

    public int getMesesPagados() {
        return mesesPagados;
    }

    public void setMesesPagados(int mesesPagados) {
        if(mesesPagados < 1){
            System.out.println("ERROR: no se puede asignar menos de 1 mes pagado");
            this.mesesPagados = 1;
        }else{
            this.mesesPagados = mesesPagados;
        }
    }

    public double getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(double tarifaMensual) {
        if (tarifaMensual < 0){
            System.out.println("ERROR: la tarifa no puede ser menor a 0");
            this.tarifaMensual = 0;
        }else{
            this.tarifaMensual = tarifaMensual;
        }
    }

    public void renovarSuscripcion(int mesesExtras){
        if (mesesExtras < 0){
            System.out.println("ERROR: los meses a renovar no pueden ser menores a 0");
        }else{
            this.mesesPagados += mesesExtras;
        }
    }
    public void renovarSuscripcion(double pagoRealizado){
        if (pagoRealizado < 0 || pagoRealizado<tarifaMensual){
            System.out.println("ERROR: pago invalido, valor menor a 0 o menor que la tarifa mensual");
        }else{
            int mesesExtras = (int)(tarifaMensual/pagoRealizado);
            renovarSuscripcion(mesesExtras);
        }
    }

}
