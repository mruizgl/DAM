package bloque6;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero ingresado por el usuario, lo convierta a un valor double y
 * muestre la raíz cuadrada de ese número.
 */
public class Ejercicio65 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número entero: ");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();;
        double raizCuadrada = Math.sqrt(numero);


        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
