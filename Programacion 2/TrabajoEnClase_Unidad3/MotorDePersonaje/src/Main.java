//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreadorPersonaje guerrero = new CreadorPersonaje("Thor",100,5);
        CreadorPersonaje mago = new CreadorPersonaje("Gandalf",50,10);
        System.out.println(guerrero);
        System.out.println(mago);

        guerrero.setNivel(-5);
        mago.curar(200);
        System.out.println(mago);

        guerrero.recibirDaño(150);
        guerrero.curar(20);
        System.out.println(guerrero);
    }
}