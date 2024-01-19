package bloque4;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario un número (puede ser entero o decimal) y determine si es divisible por 5.
 */
public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        if (numero % 5 == 0) {
            System.out.println("El numero es divisible por 5");
        }else {
            System.out.println("El numero no es divisible por 5");
        }
    }
}
