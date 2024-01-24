package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que reemplace todas las ocurrencias de una letra específica en una cadena de texto.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingresa la letra a reemplazar: ");
        char letraOriginal = scanner.next().charAt(0);

        System.out.print("Ingresa la nueva letra: ");
        char nuevaLetra = scanner.next().charAt(0);

        scanner.close();

        String nuevaCadena = cadena.replace(letraOriginal, nuevaLetra);

        System.out.println("Cadena modificada: " + nuevaCadena);

    }
}
