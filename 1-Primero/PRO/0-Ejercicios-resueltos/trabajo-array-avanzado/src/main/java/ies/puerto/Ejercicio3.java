package ies.puerto;

import java.util.Scanner;

/**
 * Clase que tiene como objetivo establecer tres array, el cual el tercero será la suma del primero y el segundo.
 * Después se suma ambos arrays.
 */
public class Ejercicio3 {
    int[] array1 = new int[5];
    int[] array2 = new int [5];
    int[] array3 = new int [5];

    /**
     * Funcion que crea el array 3 a partir de la suma de array1 y array2
     * @return devuelve suma
     */
    public int[] crearArray3 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce valores para array1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Introduce un número para la posición " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Introduce valores para array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Introduce un número para la posición " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        return array3;
    }

    /**
     * Funcion que suma ambos arrays
     * @return devuelve la suma total
     */
    public int sumarArrays () {

        int total = 0;
        for (int i = 0; i < array3.length; i++) {
            total += array3[i];
        }
        return total;
    }

}
