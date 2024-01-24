package bloque6;

import java.util.Scanner;

/**
 * Escribe un programa que tome tu nombre y apellido ingresados por separado y muestre tu nombre completo en una sola línea.
 */
public class Ejercicio63 {
    public static void main(String[] args) {
        System.out.println("Ingrese nombre");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = scanner.nextLine();

        System.out.println("El nombre es " + nombre + " " + apellidos);
    }
}
