package Ejercicio_02;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        setSaldo(saldo);
        setTitular(titular);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()){
            System.out.println("ERROR: el titular no puede estar vacio");
            this.titular = "Sin titular";
        }else{
            this.titular = titular;
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            System.out.println("ERROR: el saldo no puede ser negativo");
            this.saldo = 0;
        }else {
            this.saldo = saldo;
        }
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > saldo){
            System.out.println("ERROR: el monto a retirar no puede ser mayor al saldo");
            return;
        }
        System.out.println("Operacion exitosa");
        saldo -= monto;

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
