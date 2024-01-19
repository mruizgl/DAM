package bloque7;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar cinco números y calcule el producto de
 * esos números utilizando un bucle for.
 */
public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int producto = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            producto *= numero;
        }

        System.out.println("El producto de los cinco números es: " + producto);

        }
}
