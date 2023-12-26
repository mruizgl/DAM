package bloque2;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome el precio de un producto ingresado por el usuario y muestre el precio final con el 7% de IGIC incluido .
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio del producto");
        Scanner scanner = new Scanner(System.in);
        double precio = scanner.nextDouble();
        double igic = precio * 0.07;
        double resultado = precio + igic;
        System.out.println("El precio del producto con IGIC es " + resultado);
    }
}
