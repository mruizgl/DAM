package bloque5;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos números enteros ingresados por el usuario y muestre cuál es mayor o si son iguales.
 */
public class Ejercicio41 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero2 = scanner.nextInt();
        comprobarNumeroMayor(numero1, numero2);
    }

    public static void comprobarNumeroMayor (int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor");
        } else if (numero1 == numero2) {
            System.out.println("Ninguno es mayor porque son iguales");
        } else {
            System.out.println("El numero "+numero2+" es mayor");
        }
    }
}
