package bloque5;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura. Luego,
 * pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 */
public class Ejercicio46 {
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
