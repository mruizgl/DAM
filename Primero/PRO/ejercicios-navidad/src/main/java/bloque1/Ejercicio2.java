package bloque1;

import java.util.Scanner;

/**
 * Clase que da bienvenida personalizada
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
