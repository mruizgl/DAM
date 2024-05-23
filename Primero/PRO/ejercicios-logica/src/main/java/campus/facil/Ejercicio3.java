package campus.facil;

import java.util.Scanner;

/*
Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "esternocleidomastoideo";
        String cadenaInvertida = "";
        int largo = cadena.length();

        for (int i = largo - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);
    }
}
