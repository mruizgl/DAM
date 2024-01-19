package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            String binario = convertirDecimalABinario(numero);

            System.out.println("La representación binaria de " + numero + " es: " + binario);

        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero válido.");
        } finally {
            scanner.close();
        }
    }

    private static String convertirDecimalABinario(int numero) {
        return Integer.toBinaryString(numero);
    }
}
