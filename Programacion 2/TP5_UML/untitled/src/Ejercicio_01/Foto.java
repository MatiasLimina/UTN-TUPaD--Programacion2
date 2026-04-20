package Ejercicio_01;

public class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        setImagen(imagen);
        setFormato(formato);
    }

    public String getImagen() {
        return imagen;
    }
    public String getFormato() {
        return formato;
    }
    public void setImagen(String imagen) {
        if(imagen == null || imagen.isBlank()){
            System.out.println("La imagen no puede estar vacia");
            this.imagen = "Sin descripcion";
        }else{
            this.imagen = imagen;
        }
    }
    public void setFormato(String formato) {
        if(formato == null || formato.isBlank()){
            System.out.println("El formato no puede estar vacio");
            this.formato = "Sin formato";
        }else{
            this.formato = formato;
        }
    }
    @Override
    public String toString() {
        return "Foto [imagen=" + imagen + ", formato=" + formato + "]";
    }
}
