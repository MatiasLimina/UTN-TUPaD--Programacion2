package Ejercicio_04;

public class Gallina {
    private int idGallina;
    private int huevosPuestos;
    private int edad;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        if (idGallina <= 0){
            System.out.println("El id de la gallina debe ser positivo");
        }else{
            this.idGallina = idGallina;
        }
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos < 0){
            System.out.println("El número de huevos puestos debe ser positivo");
        }else{
            this.huevosPuestos = huevosPuestos;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0){
            System.out.println("La edad debe ser positiva");
        }else{
            this.edad = edad;
        }
    }

    public void envejecer(){
        this.edad++;
    }
    public void ponerHuevo(int huevos){
        if (huevos <= 0){
            System.out.println("El número de huevos debe ser positivo");
        }else{
            this.huevosPuestos += huevos;
        }
    }
    public void mostrarInfo(){
        System.out.println("ID: " +this.idGallina);
        System.out.println("Huevos puestos: " +this.huevosPuestos);
        System.out.println("Edad: " +this.edad);
    }

}

