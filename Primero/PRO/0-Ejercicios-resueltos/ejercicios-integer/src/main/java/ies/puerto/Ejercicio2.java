package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que convierta un número entero en una cadena de texto y viceversa utilizando los métodos de la clase Integer.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numeroEntero = scanner.nextInt();
        String cadenaDesdeNumero = Integer.toString(numeroEntero);
        System.out.println("Número convertido a cadena: " + cadenaDesdeNumero);

        System.out.print("Ingresa una cadena numérica: ");
        String cadenaNumerica = scanner.next();
        try {
            int numeroDesdeCadena = Integer.parseInt(cadenaNumerica);
            System.out.println("Cadena convertida a número entero: " + numeroDesdeCadena);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no es un número entero válido.");
        }
    }
}
