package ies.puerto;

import java.util.Scanner;

/**
 * Crea una aplicación en Java que construya y muestre una representación gráfica de un sistema montañoso.
 * El programa debe de solicitar por teclado el número de columnas y si es menor que cuatro generar una exception indicando el error.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introfduzca numero de columnas");
        Scanner scanner = new Scanner(System.in);
        int columnas = scanner.nextInt();
        pintarTriangulo(columnas);
    }

    public static void pintarTriangulo(int columnas) {
        int numeroMontanias = columnas / 2;
        for (int i = 1; i <= 3; i++) {
            for (int u = 0; u < numeroMontanias; u++) {
                for (int j = 1; j <= columnas - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= columnas - i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println(""); //cambio de linea / salto
        }


    }
}
