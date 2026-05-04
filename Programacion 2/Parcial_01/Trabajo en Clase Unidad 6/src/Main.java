import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List <Vehiculo> vehiculos = new ArrayList<>(List.of(
                new Auto(4,"Audi","A4"),
                new Moto (true,"Suzuki","A45GFH"),
                new Camion(400.5,"Volkswagen","G670")
        ));

        for (Vehiculo v:vehiculos){
            v.mostrarInfo();
            v.moverse();
        }





    }
}