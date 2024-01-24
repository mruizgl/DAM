package bloque6;

import java.util.Scanner;

/**
 * Haz un programa que tome una frase y una palabra ingresada por el usuario, luego determine si la palabra está contenida en la frase.
 */
public class Ejercicio66 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        if (frase.toLowerCase().contains(palabra)) {
            System.out.println("La frase contiene la palabra");
        }else {
            System.out.println("La frase no contiene la palabra");
        }
    }
}
