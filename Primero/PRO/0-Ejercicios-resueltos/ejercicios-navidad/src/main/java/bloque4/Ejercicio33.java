package bloque4;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario y verifique si contiene la letra 'a' y muestra un mensaje adecuado.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Introduzca cadena");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        boolean contieneA = cadena.toLowerCase().contains("a");

        if (contieneA) {
            System.out.println("La cadena contiene 'a'");
        }else{
            System.out.println("La cadena NO contiene 'a'");
        }
    }
}
