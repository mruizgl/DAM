package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como entrada y verifique si es par o impar utilizando los métodos de
 * la clase Integer. Controla las exeption que pudiera generar.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            verificarParImpar(numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número entero válido.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    private static void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}

