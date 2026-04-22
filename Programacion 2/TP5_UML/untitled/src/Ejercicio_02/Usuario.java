package Ejercicio_02;

public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;

    public Usuario(String nombre, int dni, Celular celular) {
        setNombre(nombre);
        setDni(dni);
        setCelular(celular);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if(dni < 0){
            System.out.println("El dni no puede ser negativo");
            this.dni = 00000000;
        }else{
            this.dni = dni;
        }
    }

    public Celular getCelular() {
        return celular;
    }
    public void setCelular(Celular celular) {
        if (celular == null) {
            return;
        }
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", celular=" + celular.getImei() +
                '}';
    }
}

