package bloque5;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.
 */
public class Ejercicio49 {
    public static void main(String[] args) {
        System.out.println("Introduzca su edad");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();

        if (edad >= 18 && edad <= 65) {
            System.out.println("El usuario tiene entre 18 y 65 años");
        }else if (edad < 18 && edad >= 0) {
            System.out.println("El usuario es menor de 18 años");
        }else if (edad > 65) {
            System.out.println("El usuario es mayor de 65 años");
        }else if (edad < 0){
            System.out.println("El usuario no puede tener edad negativa");
        }
    }
}
