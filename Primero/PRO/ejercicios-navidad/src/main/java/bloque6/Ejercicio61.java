package bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número entero ingresado por el usuario y lo convierta a una
 * cadena, luego muestre la longitud de esa cadena.
 */
public class Ejercicio61 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        String cadenaNumero = Integer.toString(numero);

        System.out.println("El número convertido a cadena es: " + cadenaNumero);
        System.out.println("La longitud de la cadena es: " + cadenaNumero.length());
    }
}
