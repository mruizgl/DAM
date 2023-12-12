package ies.puerto;

import java.util.regex.Pattern;

/**
 * Implementa un validador que verifique si una cadena sigue el formato de fecha común (por ejemplo, DD/MM/AAAA).
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String input = "32/03/1997";

        String regex = "^([012][0-9]|[3][01])/([0][0-9]|[1][012])/[0-9]{4,4}$";

        if (Pattern.matches(regex, input)) {
            System.out.println("Fecha válida.");
        } else {
            System.out.println("Fecha no válida.");
        }
    }
}
