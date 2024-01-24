package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que calcule y muestre la suma de los dígitos de un número entero.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            int suma = calcularSumaDigitos(numero);

            System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero válido.");
        }
    }

    private static int calcularSumaDigitos(int numero) {
        numero = Math.abs(numero);

        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}
