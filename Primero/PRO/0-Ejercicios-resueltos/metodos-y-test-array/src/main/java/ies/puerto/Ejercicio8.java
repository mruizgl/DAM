package ies.puerto;

import java.util.Arrays;

public class Ejercicio8 {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};

        int[] resultado = eliminarDuplicados(array);

        System.out.println("Valores iniciales del array:");
        mostrarArray(array);

        System.out.println("\nValores finales del array sin duplicados:");
        mostrarArray(resultado);
    }

    public static int[] eliminarDuplicados(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .toArray();
    }

    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

}