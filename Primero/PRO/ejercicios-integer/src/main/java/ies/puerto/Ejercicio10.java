package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que verifique si una cadena de texto puede convertirse en un número entero utilizando métodos de la clase Integer
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa una cadena de texto: ");
            String cadena = scanner.nextLine();

            if (esEntero(cadena)) {
                System.out.println("La cadena \"" + cadena + "\" puede convertirse en un número entero.");
            } else {
                System.out.println("La cadena \"" + cadena + "\" no puede convertirse en un número entero.");
            }

        } catch (Exception e) {
            System.out.println("Error: Ingresa una cadena de texto válida.");
        } 
    }

    private static boolean esEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
