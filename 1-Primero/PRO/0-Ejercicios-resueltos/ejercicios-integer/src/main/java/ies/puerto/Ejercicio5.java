package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros como entrada y muestre el máximo común divisor utilizando métodos de la clase Integer.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número entero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int numero2 = scanner.nextInt();

            int mcd = calcularMCD(numero1, numero2);

            System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);

        } catch (Exception e) {
            System.out.println("Error: Ingresa números enteros válidos.");
        }
    }

    private static int calcularMCD(int numero1, int numero2) {
        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }

        return numero1;
    }
}
