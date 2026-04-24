package Ejercicio_10;

public class CuentaBancaria {
    int cbu;
    double saldo;
    Titular titular;
    ClaveSeguridad claveSeguridad;

    public CuentaBancaria(int cbu, double saldo, Titular titular, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        setTitular(titular);
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public int getCbu() {
        return cbu;
    }
    public double getSaldo() {
        return saldo;
    }
    public Titular getTitular() {
        return titular;
    }
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular.getNombre() + ", claveSeguridad=" + claveSeguridad + '}';
    }
}
