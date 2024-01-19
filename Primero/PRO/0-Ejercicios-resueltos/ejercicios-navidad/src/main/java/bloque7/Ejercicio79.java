package bloque7;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero ingresado por el usuario y cuente cuántos
 * dígitos tiene utilizando un bucle for.
 */
public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        boolean esNegativo = numero < 0;
        if (esNegativo) {
            numero = -numero;
        }

        String numeroComoCadena = Integer.toString(numero);
        int contadorDigitos = 0;
        for (int i = 0; i < numeroComoCadena.length(); i++) {
            contadorDigitos++;
        }

        System.out.println("El número ingresado tiene " + contadorDigitos + " dígitos.");

    }
}
