package bloque6;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número decimal, lo convierta a una cadena y muestre cuántos dígitos tiene después del punto decimal.
 */
public class Ejercicio67 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número decimal: ");
        Scanner scanner = new Scanner(System.in);
        double numeroDecimal = scanner.nextDouble();

        String cadenaDecimal = Double.toString(numeroDecimal);
        int posicionPuntoDecimal = cadenaDecimal.indexOf('.');
        int digitosDespuesPunto = cadenaDecimal.length() - posicionPuntoDecimal - 1;

        System.out.println("El número " + numeroDecimal + " tiene " + digitosDespuesPunto + " dígitos después del punto decimal.");
    }
}
