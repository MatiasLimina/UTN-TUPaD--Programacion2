package Ejercicio_02;

public class Utilidades {
    public static String verificarString(String cadena) {
        if (cadena == null || cadena.isBlank()){
            return null;
        }else {
            return cadena;
        }
    }

}
