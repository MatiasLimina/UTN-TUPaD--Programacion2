package Ejercicio_04;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        setNumero(numero);
        setFechaVencimiento(fechaVencimiento);
        setBanco(banco);
        setCliente(cliente);
    }
    public String getNumero() {
        return numero;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setNumero(String numero) {
        if( numero.length() != 16){
            System.out.println("El numero de la tarjeta debe tener 16 digitos");
            this.numero = "0000000000000000";
        }else if ( numero == null || numero.isBlank() ){
            System.out.println("El numero de la tarjeta no puede estar vacio");
            this.numero = "0000000000000000";
        }else {
            this.numero = numero;
        }
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        if ( fechaVencimiento == null || fechaVencimiento.isBlank() ){
            System.out.println("La fecha de vencimiento no puede estar vacia");
            this.fechaVencimiento = "00/00";
        }else {
            this.fechaVencimiento = fechaVencimiento;
        }
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente; // 1. Me guardo al cliente

        // 2. Si el cliente existe y aún no tiene mi número, le aviso
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }


    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", banco=" + banco.getNombre() +
                ", cliente=" + cliente.getNombre() +
                '}';
    }
}
