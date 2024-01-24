package bloque4;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = -12.43;
        if (numero > 0) {
            System.out.println("El numero es positivo");
        }else if (numero < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es cero");
        }
    }
}
