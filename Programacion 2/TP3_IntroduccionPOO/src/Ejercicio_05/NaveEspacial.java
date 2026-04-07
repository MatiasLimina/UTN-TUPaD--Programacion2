package Ejercicio_05;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int CAPACIDAD_MAXIMA = 100;
    private boolean yaDespegado;
    private int distanciaAvanzada;

    public String getNombre() {
        return nombre;
    }

    public boolean isYaDespegado() {
        return yaDespegado;
    }

    public int getDistanciaAvanzada() {
        return distanciaAvanzada;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if(combustible < 0){
            System.out.println("El combustible debe ser positivo");
        }else if(combustible > CAPACIDAD_MAXIMA){
            System.out.println("El combustible no puede ser mayor a la capacidad maxima");
        }else{
            this.combustible = combustible;
        }
    }
    public void despegar(){
        if (combustible < 5 ){
            System.out.println("ERROR: No se puede despegar la nave, falta combustible");
        }else{
            System.out.println("Despegando");
            this.combustible -= 5;
            this.yaDespegado = true;
        }
    }

    public void avanzar(int distancia){
        int costoAvanzar = 2*distancia;
        if (!yaDespegado){
            System.out.println("ERROR: La nave debe despegar antes de avanzar");
        }else if(distancia <= 0){
            System.out.println("ERROR: La distancia debe ser positiva");
        }else if(combustible < costoAvanzar){
            System.out.println("ERROR: No hay combustible suficiente para avanzar");
        }else{
            System.out.println("Avanzando " + distancia +"km");
            this.combustible -= costoAvanzar;
            this.distanciaAvanzada += distancia;
        }
    }
    public void recargarCombustible(int recarga){
        this.combustible += recarga;
        if (this.combustible > CAPACIDAD_MAXIMA){
            this.combustible = CAPACIDAD_MAXIMA;
            System.out.println("Combustible recargado al maximo.El excedente no puede ser almacenado");
        }

    }
    public void mostrarInfo(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Combustible: " +combustible);
        System.out.println("Ya despegado: " +yaDespegado);
        System.out.println("Distancia avanzada: " +distanciaAvanzada);
    }

}
