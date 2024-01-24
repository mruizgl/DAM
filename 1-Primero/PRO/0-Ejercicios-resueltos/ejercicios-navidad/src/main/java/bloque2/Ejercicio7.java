package bloque2;


import java.util.Scanner;

/**
 * Desarrolla un programa que solicite al usuario una cantidad en euros y muestre su equivalente en dólares solicitando el valor cambio.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de euros que desee pasar a dólares");
        Scanner scanner = new Scanner(System.in);
        double euros = scanner.nextDouble();
        double valorCambio = 1.1013;
        double resultado = euros * valorCambio;

        System.out.println("La cantidad de " + euros + "€ en dólares es " + resultado);
    }
}
