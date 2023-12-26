package bloque2;

import java.util.Scanner;

/**
 * Crea un programa que tome el radio de un círculo ingresado por el usuario y muestre su área.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ingrese el radio del circulo");
        Scanner scanner = new Scanner(System.in);
        int radio = scanner.nextInt();
        double pi = 3.14;
        double resultado = pi *(radio * radio);

        System.out.println("El area del circulo es " + resultado);
    }
}
