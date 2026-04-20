import java.util.Objects;

public class Curso {
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalCursos;

    public Curso(String nombre, int duracionHoras, double precio) {
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
        setPrecio(precio);
        totalCursos ++;
        this.id = totalCursos;
    }
    public Curso(String nombre, int duracionHoras){
        this(nombre,duracionHoras,100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("ERROR: el nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }else{
            this.nombre = nombre;
        }
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0){
            System.out.println("ERROR: la duracion en horas no puede ser igual o menor a 0");
            this.duracionHoras = 1;
        }else{
            this.duracionHoras = duracionHoras;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            System.out.println("ERROR: el precio no puede ser menor a 0");
            this.precio = 0;
        }else{
            this.precio = precio;
        }
    }
    public void actualizarPrecio (double aumento){
        if (aumento < 0){
            System.out.println("ERROR: el aumento no puede ser un valor negativo");
        }else{
            precio = precio + (precio*(aumento/100));
        }
    }
    public void actualizarPrecio (int aumento){
        if (aumento<0){
            System.out.println("ERROR: el aumento no puede ser un valor negativo");
        }else{
            precio += aumento;
        }
    }
    public static String mostrarTotalCursos(){
        return "El total de cursos es de: " + totalCursos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id == curso.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
