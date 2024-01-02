package bloque7;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar números positivos utilizando un bucle do-while.
 * El bucle debe continuar hasta que el usuario ingrese un número negativo.
 */
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un numero positivo, el programa finaliza cuando ingrese uno negativo");
            numero = scanner.nextInt();
        } while (numero > 0);
    }
}
