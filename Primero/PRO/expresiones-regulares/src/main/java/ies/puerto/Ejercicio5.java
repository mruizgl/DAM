package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que reemplace todas las etiquetas HTML en una cadena con su contenido. Por ejemplo,
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String regex = "(<p>)([A-Z a-z]+)(</p>)";
        String cadena = "<p>LOREM IPSUN</p><p>ASDKASFK</p><p>sdkjfnnsakj</p>";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(cadena);
        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }

    }

}
