package Ejercicio_02;

public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(int imei, String marca, String modelo, Usuario usuario,Bateria bateria) {
        setImei(imei);
        setMarca(marca);
        setModelo(modelo);
        this.bateria = bateria;
        setUsuario(usuario);
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        if (imei < 0){
            System.out.println("El imei no puede ser negativo");
            this.imei = 0000000000000000;
        }else{
            this.imei = imei;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            System.out.println("La marca no puede estar vacia");
            this.marca = "Sin marca";
        }else{
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            System.out.println("El modelo no puede estar vacio");
            this.modelo = "Sin modelo";
        }else{
            this.modelo = modelo;
        }
    }

    public Bateria getBateria() {
        return bateria;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        if (usuario == null){
            return;
        }
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{" +
                "imei=" + imei +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
}
