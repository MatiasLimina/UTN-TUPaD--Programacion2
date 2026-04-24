package Ejercicio_09;

public class Main {
    public static void main(String[] args) {
        Profesional profesional = new Profesional("Juan", "Odontologo");
        Paciente paciente = new Paciente("Juan", "123456789");
        CitaMedica citaMedica = new CitaMedica("2023-05-01", "10:00", profesional, paciente);
        System.out.println(citaMedica);
    }
}
