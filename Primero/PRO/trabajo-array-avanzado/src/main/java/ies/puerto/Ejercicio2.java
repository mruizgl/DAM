package ies.puerto;

import java.util.Scanner;

/**
 * Clase que pide rellenar array hasta 10 elementos (o hasta que se introduzca numero negativo) y lo muestra en pantalla
 */
public class Ejercicio2 {

    /**
     * Funcion que rellena el array
     * @return devuelve numeros introducidos por el usuario
     */
    public int[] introducirNumeros () {
        int [] array = new int [10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < array.length; i++) {
            System.out.println("Introduzca 10 números: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            array[i] = numero;
        }
        return array;
    }

    /**
     * Funcion que muestra el array
     * @return muestra el array
     */
    public String mostrarArray () {
        return "Los numeros introducidos son: " + introducirNumeros();
    }
}
