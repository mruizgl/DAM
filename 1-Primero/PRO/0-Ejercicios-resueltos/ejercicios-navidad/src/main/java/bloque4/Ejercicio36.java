package bloque4;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura. Luego,
 * pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        float maximaTemperatura = 36.5f;
        System.out.println("Introduzca temperatura");
        Scanner scanner = new Scanner(System.in);
        float temperatura = scanner.nextFloat();
        if (temperatura > maximaTemperatura) {
            System.out.println("¡Cuidado! La temperatura está por encima del rango permitido");
        } else {
            System.out.println("La temperatura está por debajo del máximo permitido");
        }
    }
}
