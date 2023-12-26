package bloque2;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario su edad y luego muestre si es mayor de edad o no.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Es usted mayor de edad");
        }else {
            System.out.println("Es usted menor de edad");
        }
    }
}
