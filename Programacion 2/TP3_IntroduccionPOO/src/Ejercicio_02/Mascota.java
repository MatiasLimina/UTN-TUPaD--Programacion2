package Ejercicio_02;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if(especie == null || especie.trim().isEmpty()){
            System.out.println("La especie no puede estar vacia");
        }else{
            this.especie = especie;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad <= 0){
            System.out.println("La edad debe ser positiva");
        }else{
            this.edad = edad;
        }
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    public void cumplirAños(){
        edad++;
    }
}
