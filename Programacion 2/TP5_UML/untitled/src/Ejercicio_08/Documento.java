package Ejercicio_08;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo,String contenido, String codigoHash,String fecha, Usuario usuario){
        setContenido(contenido);
        setTitulo(titulo);
        setFirmaDigital(codigoHash,fecha,usuario);
    }

    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    public void setTitulo(String titulo) {
        if ( titulo == null || titulo.isBlank() ){
            System.out.println("El titulo no puede estar vacio");
            this.titulo = "Sin titulo";
        }else {
            this.titulo = titulo;
        }
    }
    public void setContenido(String contenido) {
        if ( contenido==null || contenido.isBlank()){
            System.out.println("El contenido no puede estar vacio");
            this.contenido = "Sin contenido";
        }else {
            this.contenido = contenido;
        }
    }
    public void setFirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.firmaDigital = new FirmaDigital(codigoHash,fecha,usuario);
    }
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
}
