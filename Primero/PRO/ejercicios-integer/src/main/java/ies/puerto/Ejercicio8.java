package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que calcule el factorial de un número entero utilizando métodos de la clase Integer.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero no negativo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Error: Ingresa un número no negativo.");
            } else {
                int factorial = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " es: " + factorial);
            }

        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero válido.");
        } finally {
            scanner.close();
        }
    }

    public static int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
