package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que tiene como objetivo pintar un cuadro equilátero donde la altura la introduce el usuario por consola
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        pintarTriangulo();

    }

    /**
     * Función para cargar la matriz con forma de triangulo equilátero
     * @return devuelve triangulo pintado
     */

    public static void pintarTriangulo() {
        System.out.println("Introduzca la altura que tendrá el triángulo equilátero: ");
        Scanner scanner = new Scanner(System.in);
        int filas = 9;
        int columnas = scanner.nextInt();
        int[][] triangulo = new int[filas][columnas];

        for (int i  = 0; i < 9; i++) {
            for (int j = 0; j < triangulo[filas].length; j++) {
                int medio = filas / 2;
                triangulo[i][filas] = 1;
            }
        }
        System.out.println(Arrays.deepToString(triangulo));
    }
}



