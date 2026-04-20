import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Pruebas de errores y robustez");
        System.out.println("Prueba 1");
        Curso curso1 = new Curso("Fisica",2,200.0);
        System.out.println(curso1);
        curso1.actualizarPrecio(100);
        System.out.println(curso1);
        curso1.actualizarPrecio(50.0);
        System.out.println(curso1);
        System.out.println(Curso.mostrarTotalCursos());
        System.out.println("--------------------------");
        System.out.println("Prueba 2");
        Curso curso2 = new Curso("Programacion",20);
        System.out.println(curso2);
        curso2.actualizarPrecio(-300);
        System.out.println(curso2);
        curso2.actualizarPrecio(-60.0);
        System.out.println(curso2);
        curso2.actualizarPrecio(3000);
        System.out.println(curso2);
        System.out.println(Curso.mostrarTotalCursos());
        System.out.println("--------------------------");
        System.out.println("Prueba 3");
        Curso curso3 = new Curso("",-40);
        System.out.println(curso3);
        curso3.actualizarPrecio(200.0);
        System.out.println(curso3);
        curso3.actualizarPrecio(-1000);
        System.out.println(curso3);
        System.out.println(Curso.mostrarTotalCursos());
        System.out.println("--------------------------");
        System.out.println("Prueba 4");
        Curso curso4 = new Curso("Lengua",2,-200.0);
        System.out.println(curso4);
        System.out.println(Curso.mostrarTotalCursos());
        System.out.println("--------------------------");
        System.out.println("Prueba 5");
        Curso curso5 = new Curso("",20,6500.50);
        System.out.println(curso5);
        System.out.println(Curso.mostrarTotalCursos());
    }
}