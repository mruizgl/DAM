package bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome una cadena ingresada por el usuario y cuente cuántas vocales
 * (a, e, i, o, u) contiene. Utiliza un bucle while.
 */
public class Ejercicio73 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        int contadorVocales = 0;
        cadena = cadena.toLowerCase();

        int indice = 0;

        while (indice < cadena.length()) {
            char caracter = cadena.charAt(indice);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }

            indice++;
        }

        System.out.println("La cadena tiene " + contadorVocales + " vocal(es).");


    }

}
