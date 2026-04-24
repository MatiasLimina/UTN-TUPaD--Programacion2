package Ejercicio_07;

public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        setTipo(tipo);
        setNumeroSerie(numeroSerie);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            this.tipo = "Desconocido";
        } else {
            this.tipo = tipo;
        }
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        if (numeroSerie == null || numeroSerie.trim().isEmpty()) {
            this.numeroSerie = "000000";
        } else {
            this.numeroSerie = numeroSerie;
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
