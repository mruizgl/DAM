package bloque7;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar números con un bucle while y calcule la suma de esos números.
 * Termina el bucle cuando la suma alcance o supere 100.
 */
public class Ejercicio70 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);


        while (resultado <= 100) {
            System.out.println("Ingrese numeros para sumar");
            numero1 = scanner.nextInt();
            System.out.println("Ingrese numeros para sumar");
            numero2 = scanner.nextInt();
            resultado = numero1 + numero2;
        }
        System.out.println("El resultado es " + resultado);


    }
}
