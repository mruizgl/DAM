package ies.puerto;

import java.util.Scanner;

/**
 * Clase que dado un valor específico, encuentra su posición en el array o indica si no está presente.
 * @author Melissa Ruiz
 */
public class Ejercicio5 {
    /**
     * Método main que nos muestra el resultado en pantalla
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Introduzca valor específico: ");
        Scanner sc = new Scanner (System.in);
        int valor = sc.nextInt();
        int valorABuscar = valor;

        int posicion = encontrarPosicionEnArray(array, valorABuscar);

        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El valor " + valorABuscar + " no está presente en el array.");
        }
    }

    /**
     * Método para encontrar posicion en el array
     * @param array Es la cantidad de elementos del array
     * @param valor La posicion
     * @return Devuelve resultado
     */
    public static int encontrarPosicionEnArray(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
