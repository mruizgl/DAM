package ies.puerto.ejercicios.cinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {

    public static List<Integer> obtenerNumerosPares(ArrayList<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        return numerosPares;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> numerosPares = obtenerNumerosPares(listaNumeros);

        System.out.println("Lista original: " + listaNumeros);
        System.out.println("Números pares: " + numerosPares);
    }
}
