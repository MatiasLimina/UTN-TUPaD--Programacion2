package Ejercicio_04;

public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, int dni,TarjetaDeCredito tarjeta) {
        setDni(dni);
        setNombre(nombre);
        setTarjeta(tarjeta);
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setNombre(String nombre) {
        if ( nombre == null || nombre.isBlank() ){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
    }
    public void setDni(int dni) {
        if( dni < 0 ){
            System.out.println("El dni no puede ser negativo");
            this.dni = 00000000;
        }else {
            this.dni = dni;
        }
    }
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta; // 1. Me guardo la tarjeta
        // 2. Si la tarjeta existe y aún no me conoce a mí, le aviso quién soy
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + tarjeta.getNumero() + '}';
    }
}
