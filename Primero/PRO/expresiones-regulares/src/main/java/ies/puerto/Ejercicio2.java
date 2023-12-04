package ies.puerto;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que extraiga todos los números de teléfono válidos (con formato +XX-XXX-XX-XX-XX)
 * de una cadena dada. (Combina lo aprendido).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String numeros = "Telefono uno: +34-699-20-19-89, Telefono dos: 625428515, Telefono tres: +20-635-25-64-85";
        String regex = "\\b[0-9]{2}-\\b[0-9]{3}-\\b[0-9]{2}-\\b[0-9]{2}-\\b[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numeros);

        while (matcher.find()) {
            System.out.println("Teléfono válido extraido: " + matcher.group());
        }

    }
}
