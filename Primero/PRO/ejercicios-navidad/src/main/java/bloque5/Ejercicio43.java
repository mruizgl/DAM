package bloque5;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario y verifique si contiene la letra 'a' y muestra un mensaje adecuado.
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        if (cadena.toLowerCase().contains("a")) {
            System.out.println("La cadena contiene la letra a");
        }else {
            System.out.println("La cadena no contiene la letra a");
        }
    }
}
