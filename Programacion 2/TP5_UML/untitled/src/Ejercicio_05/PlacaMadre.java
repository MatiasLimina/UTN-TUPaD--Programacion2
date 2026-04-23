package Ejercicio_05;

public class PlacaMadre {
    private String marca;
    private String chipset;

    public PlacaMadre(String marca,String chipset){

    }
    public String getMarca() {
        return marca;
    }
    public String getChipset() {
        return chipset;
    }
    public void setMarca(String marca) {
        if( marca == null || marca.isBlank() ){
            System.out.println("La marca no puede estar vacia");
            this.marca = "Sin marca";
        }else {
            this.marca = marca;
        }
    }
    public void setChipset(String chipset) {
        if ( chipset == null || chipset.isBlank() ){
            System.out.println("El chipset no puede estar vacio");
            this.chipset = "Sin chipset";
        }else {
            this.chipset = chipset;
        }
    }
    @Override
    public String toString() {
        return "PlacaMadre{" + "marca=" + marca + ", chipset=" + chipset + '}';
    }
}
