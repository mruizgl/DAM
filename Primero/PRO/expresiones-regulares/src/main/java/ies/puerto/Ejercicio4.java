package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que cuente el número de palabras en formato Camel Case (palabras concatenadas sin espacios) en una cadena.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena = "holaEstoYEsUnaPrueba";
        String regex = "([a-z]+)|([A-Z][a-z]*)";
        int contador = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);

        while (matcher.find()) {
            contador++;

        }
        System.out.println("El numero de palabras es: " + contador);
    }
}
