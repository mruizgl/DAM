package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase para pedir 5 números, mostrar los 5 números, muestra la suma y los muestra en orden creciente y en orden decreciente.
 * @author Melissa Ruiz
 */
public class Ejercicio3 {
    /**
     * Funcion que solicita al usuario que ingrese 5 números, luego muestra los números ingresados,
     * la suma de esos números, y finalmente los muestra en orden creciente y en orden decreciente
     */
    public static void recogerNumeros() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
            for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Los números ingresados son: ");
        mostrarNumeros(numeros);

        int suma = calcularSuma(numeros);
        System.out.println("La suma de los números es: " + suma);

        System.out.print("Los números en orden creciente son: ");
        Arrays.sort(numeros);
        mostrarNumeros(numeros);

        System.out.print("Los números en orden decreciente son: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    /**
     * Metodo que calcula la suma de los numeros ingresados
     * @param numeros valor para hacer la suma
     * @return devuelve la suma de los numeros ingresados
     */
    public static int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
                suma += numero;
            }
        return suma;
    }

    /**
     * Metodo para mostrar los numeros ingresados
     * @param numeros Los numeros que han sido ingresados
     */
    public static void mostrarNumeros(int[] numeros) {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
