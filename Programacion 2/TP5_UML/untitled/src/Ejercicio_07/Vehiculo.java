package Ejercicio_07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        setModelo(modelo);
        setPatente(patente);
        setMotor(motor);
        setConductor(conductor);
    }

    public String getPatente() {
        return patente;
    }
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public Conductor getConductor() {
        return conductor;
    }

    public void setPatente(String patente) {
        if ( patente == null || patente.isBlank()){
            System.out.println("La patente no puede estar vacia");
            this.patente = "Sin patente";
        }else{
            this.patente = patente;
        }
    }
    public void setModelo(String modelo) {
        if ( modelo == null || modelo.isBlank()){
            System.out.println("El modelo no puede estar vacio");
            this.modelo = "Sin modelo";
        }else {
            this.modelo = modelo;
        }
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", conductor=" + conductor +
                '}';
    }
}
