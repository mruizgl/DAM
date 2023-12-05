package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que determine si un número entero es positivo, negativo o cero utilizando métodos de la clase Integer.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            determinarPosNegCero(numero);

        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero válido.");
        } finally {
            scanner.close();
        }
    }

    private static void determinarPosNegCero(int numero) {
        if (Integer.signum(numero) == 1) {
            System.out.println(numero + " es un número positivo.");
        } else if (Integer.signum(numero) == -1) {
            System.out.println(numero + " es un número negativo.");
        } else {
            System.out.println(numero + " es cero.");
        }
    }
}
