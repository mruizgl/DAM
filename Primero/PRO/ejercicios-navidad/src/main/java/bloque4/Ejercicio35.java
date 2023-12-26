package bloque4;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un carácter ingresado por el usuario y determine si es una vocal o una consonante.
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.println("Ingrese un caracter");
        Scanner scanner = new Scanner(System.in);
        String caracter = scanner.nextLine().toLowerCase();
        if (caracter == "a" || caracter == "e" || caracter == "i" || caracter == "o" || caracter == "u") {
            System.out.println("El caracter introducido es vocal");
        }else {
            System.out.println("El caracter introducido es consonante");
        }
    }
}
