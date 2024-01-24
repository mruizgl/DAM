package ies.puerto;

/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "Feliz Navidad";

        int contador = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        System.out.println("El número de vocales es " + contador);
    }
}
