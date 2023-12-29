package bloque5;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario un número (puede ser entero o decimal) y determine si es divisible por 5.
 */
public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero o decimal");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        if (numero % 5 == 0) {
            System.out.println("El numero es divisible por 5");
        }else {
            System.out.println("El numero NO es divisible por 5");
        }
    }
}
