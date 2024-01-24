package ies.puerto;

/**
 * Implementa un programa que convierta una cadena de texto a minúsculas y otra a mayúsculas.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena = "Feliz Navidad";

        String enMinusculas = cadena.toLowerCase();

        String enMayusculas = cadena.toUpperCase();

        System.out.println("En minúsculas: " + enMinusculas);
        System.out.println("En mayúsculas: " + enMayusculas);
    }
}
