package bloque5;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero decimal");
        Scanner scanner = new Scanner(System.in);
        float numero = scanner.nextFloat();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        }else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero == 0){
            System.out.println("El numero es 0");
        }
    }
}
