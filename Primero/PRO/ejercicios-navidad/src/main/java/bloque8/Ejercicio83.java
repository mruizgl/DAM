package bloque8;

import java.util.Scanner;

/**
 * Crea un programa que busque un número específico en un array y muestre su posición si se encuentra, o un mensaje
 * indicando que no se encontró. >Nota: Definir e introducir valores lo has realizado en el ejercicio anterior_.
 */
public class Ejercicio83 {
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

        System.out.print("Ingrese el número a buscar: ");
        int numeroABuscar = scanner.nextInt();

        int posicion = -1;

        for (int i = 0; i < tamanoArray; i++) {
            if (arrayEnteros[i] == numeroABuscar) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El número " + numeroABuscar + " se encuentra en la posición " + posicion + " del array.");
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el array.");
        }

    }

}
