import java.security.PublicKey;
import java.util.Objects;

public class CreadorPersonaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean isDerrotado;
    private int id;
    private static int totalPersonajes = 0;
    private int generarId() {
        totalPersonajes++;
        return totalPersonajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().isEmpty() || nombre.equals(null)){
            System.out.println("EROR: El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel <= 0 || nivel >100){
            System.out.printf("ERROR: El nivel no puede salir del rango 1-100");
        }else {
            this.nivel = nivel;
        }
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        if(puntosVida < 50 || puntosVida>100){
            System.out.println("ERROR: Los puntos de vida no pueden salir del rango 50-100");
        }else {
            this.puntosVida = puntosVida;
        }
    }
    public int getId() {
        return id;
    }
    /*
    Constructores
     */
    public CreadorPersonaje(String nombre){
        this(nombre,1,100);
    }
    public CreadorPersonaje(String nombre,int puntosVida, int nivel){
        this.id = generarId();
        this.isDerrotado = false;
        this.setNombre(nombre);
        this.setNivel(nivel);
        this.setPuntosVida(puntosVida);
    }

    public void recibirDaño(int daño){
        this.puntosVida = this.puntosVida - daño;
        if (this.puntosVida<0){
            this.puntosVida = 0;
            this.isDerrotado = true;
        }
    }
    public void curar (int puntos){
        if(this.puntosVida>0){
            this.puntosVida = this.puntosVida + puntos;
            if (this.puntosVida>100){
                this.puntosVida = 100;
                System.out.println("Los puntos de vida no pueden superar 100");
            }
        }else{
            System.out.println("Tu personaje ya esta derrotado");
        }
    }

    @Override
    public String toString() {
        return "CreadorPersonaje{" +
                "nombre: " + nombre + '\'' +
                ", nivel: " + nivel +
                ", puntosVida:" + puntosVida +
                ", isDerrotado:" + isDerrotado +
                ", id:" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreadorPersonaje that = (CreadorPersonaje) o;
        return nivel == that.nivel && puntosVida == that.puntosVida && isDerrotado == that.isDerrotado && id == that.id && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, puntosVida, isDerrotado, id);
    }
}
