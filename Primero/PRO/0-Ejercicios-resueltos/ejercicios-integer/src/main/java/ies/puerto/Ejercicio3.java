package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número entero es primo o no utilizando los métodos de la clase Integer.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero positivo mayor que 1: ");
            int numero = scanner.nextInt();

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }

        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero válido.");
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
