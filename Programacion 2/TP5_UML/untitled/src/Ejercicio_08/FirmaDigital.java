package Ejercicio_08;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital (String codigoHash, String fecha, Usuario usuario){
        setFecha(fecha);
        setCodigoHash(codigoHash);
        setUsuario(usuario);
    }
    public FirmaDigital(String codigoHash, String fecha){
        this(codigoHash,fecha,null);
    }

    public String getCodigoHash() {
        return codigoHash;
    }
    public String getFecha() {
        return fecha;
    }

    public void setCodigoHash(String codigoHash) {
        if(codigoHash == null || codigoHash.isBlank()){
            System.out.println("El codigoHash no puede estar vacio");
            this.codigoHash = "0000";
        }else {
            this.codigoHash = codigoHash;
        }
    }
    public void setFecha(String fecha) {
        if (fecha==null || fecha.isBlank()){
            System.out.println("La fecha no puede estar vacia");
            this.fecha = "00/00/0000";
        }else {
            this.fecha = fecha;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha +", Usuario: "+ usuario.getNombre() + " }";
    }
}
