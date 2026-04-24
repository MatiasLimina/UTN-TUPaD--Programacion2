package Ejercicio_10;

public class Titular {
    String nombre;
    int dni;
    CuentaBancaria cuentaBancaria;

    public Titular(String nombre, int dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        setCuentaBancaria(cuentaBancaria);
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria.getCbu() + '}';
    }
}
