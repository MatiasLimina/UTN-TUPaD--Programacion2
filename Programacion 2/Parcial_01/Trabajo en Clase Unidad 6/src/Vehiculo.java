abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public  Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public abstract void moverse();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+marca + "\nModelo: "+ modelo );
    }
}
