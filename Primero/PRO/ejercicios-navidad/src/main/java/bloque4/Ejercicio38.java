package bloque4;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y determine si tienen la misma longitud.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        System.out.println("Introduzca una cadena");
        Scanner scanner = new Scanner(System.in);
        String cadena =scanner.nextLine();
        System.out.println("Introduzca otra cadena");
        String otraCadena = scanner.nextLine();

        if (cadena.length() == otraCadena.length()) {
            System.out.println("Tienen la misma longitud");
        }else {
            System.out.println("No tienen la misma longitud");
        }
    }
}
