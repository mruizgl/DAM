package ies.puerto;

/**
 * Implementa un programa que invierta una cadena de texto dada
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = "Feliz Navidad";
        char[] caracteres = cadena.toCharArray();
        int longitud = caracteres.length;
        String cadenaInvertida = new String(caracteres);

        for (int i = 0; i < longitud / 2; i++) {
            char temporal = caracteres[i];
            caracteres[i] = caracteres[longitud - 1 - i];
            caracteres[longitud - 1 - i] = temporal;
        }

        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
}
