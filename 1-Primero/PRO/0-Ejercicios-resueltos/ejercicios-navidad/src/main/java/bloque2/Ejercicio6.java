package bloque2;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario dos números y luego muestre los dos números y su suma.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduzca el primer numero");
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("El primer numero es " + numero1 + ", el segundo numero es " + numero2 + " y el resultado de la suma de los dos numeros es " + resultado);


    }
}
