package bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número ingresado como cadena y lo convierta a un valor entero,
 * luego multiplícalo por 2 y muestra el resultado.
 */
public class Ejercicio64 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número como cadena: ");
        Scanner scanner = new Scanner(System.in);
        String cadenaNumero = scanner.nextLine();

        int numero = Integer.parseInt(cadenaNumero);

        int resultado = numero * 2;

        System.out.println("El resultado es " +resultado);
    }
}
