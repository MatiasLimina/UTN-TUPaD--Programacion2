package Ejercicio_10;

public class ClaveSeguridad {
    String codigo;
    String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
}
