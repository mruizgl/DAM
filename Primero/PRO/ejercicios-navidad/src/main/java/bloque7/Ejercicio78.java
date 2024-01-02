package bloque7;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que simule el juego "Piedra, Papel o Tijera" contra la computadora utilizando un bucle do-while.
 * El juego debe continuar hasta que el usuario elija salir.
 */

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("4. Salir");

            int eleccionUsuario = scanner.nextInt();

            if (eleccionUsuario == 4) {
                System.out.println("¡Gracias por jugar! Hasta luego.");
                break;
            }

            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Opción no válida. Por favor, elija de nuevo.");
                continue;
            }

            int eleccionComputadora = random.nextInt(3) + 1;

            System.out.println("Usted eligió: " + convertirAMovimiento(eleccionUsuario));
            System.out.println("La computadora eligió: " + convertirAMovimiento(eleccionComputadora));

            determinarGanador(eleccionUsuario, eleccionComputadora);

        } while (true);

    }


    private static String convertirAMovimiento(int eleccion) {
        switch (eleccion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "Desconocido";
        }
    }

    private static void determinarGanador(int eleccionUsuario, int eleccionComputadora) {
        if (eleccionUsuario == eleccionComputadora) {
            System.out.println("¡Empate!");
        } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                (eleccionUsuario == 3 && eleccionComputadora == 2)) {
            System.out.println("¡Usted gana!");
        } else {
            System.out.println("¡La computadora gana!");
        }
    }
}
