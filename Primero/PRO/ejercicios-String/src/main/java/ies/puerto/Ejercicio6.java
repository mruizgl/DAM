package ies.puerto;

/**
 * Escribe un programa que tome una frase e imprima cada palabra en una nueva línea.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String cadena = "Feliz Navidad";

        String[] palabras = cadena.split(" ");

        System.out.println("Palabras en líneas separadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
