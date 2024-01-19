package bloque8;

import java.util.Scanner;

/**
 * Desarrolla un programa que ordene un array de enteros en orden ascendente y luego lo muestre.
 * Solicita el tamaño del array, e introduce los valores.
 */
public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamanoArray = scanner.nextInt();
        int[] arrayEnteros = new int[tamanoArray];

        System.out.println("Ingrese los valores del array:");

        for (int i = 0; i < tamanoArray; i++) {
            System.out.print("Elemento #" + (i + 1) + ": ");
            arrayEnteros[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanoArray - 1; i++) {
            for (int j = 0; j < tamanoArray - 1 - i; j++) {
                if (arrayEnteros[j] > arrayEnteros[j + 1]) {
                    int temp = arrayEnteros[j];
                    arrayEnteros[j] = arrayEnteros[j + 1];
                    arrayEnteros[j + 1] = temp;
                }
            }
        }
        System.out.println("Array ordenado en orden ascendente:");

        for (int i = 0; i < tamanoArray; i++) {
            System.out.print(arrayEnteros[i] + " ");
        }
    }
}
