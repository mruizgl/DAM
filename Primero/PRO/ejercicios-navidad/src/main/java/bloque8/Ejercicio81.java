package bloque8;

import java.util.Scanner;

/**
 * Escribe un programa que sume todos los elementos de un array de enteros y muestre el resultado. Solicita el
 * tamaño del array, e introduce los valores, para ejecutar la suma.
 */
public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del array");
        int tamanio = scanner.nextInt();
        int[] array = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            array[i] = 2;
        }
        int suma = 0;
        for (int i = 0; i < tamanio; i++) {
            suma += array[i];
        }
        System.out.println("El resultado de la suma de los elementos del array es " + suma);
    }
}
