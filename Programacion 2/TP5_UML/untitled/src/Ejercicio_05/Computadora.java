package Ejercicio_05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String marcaPlaca,String chipsetPlaca, Propietario propietario) {
        setMarca(marca);
        setNumeroSerie(numeroSerie);
        setPlacaMadre(marcaPlaca, chipsetPlaca);
        setPropietario(propietario);
    }
    public String getMarca() {
        return marca;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if ( propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    public void setPlacaMadre(String marca, String chipset) {
           this.placaMadre = new PlacaMadre(marca, chipset);
    }
    public void setMarca(String marca) {
        if ( marca == null || marca.isBlank()){
            System.out.println("La marca no puede estar vacia");
            this.marca = "Sin marca";
        }else {
            this.marca = marca;
        }
    }
    public void setNumeroSerie(String numeroSerie) {
        if ( numeroSerie == null || numeroSerie.isBlank() ){
            System.out.println("El numero de serie no puede estar vacio");
            this.numeroSerie = "Sin numero de serie";
        }else {
            this.numeroSerie = numeroSerie;
        }
    }
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario.getNombre() + '}';
    }
}
