package bloque6;

import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros ingresados por el usuario, realice la suma y muestre el resultado.
 */
public class Ejercicio62 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("La suma de los dos numeros es " + (numero1+numero2));

    }
}
