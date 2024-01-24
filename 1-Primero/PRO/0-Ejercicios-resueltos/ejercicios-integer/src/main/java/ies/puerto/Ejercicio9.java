package ies.puerto;

import java.util.Random;

/**
 * Crea un programa que genere un número entero aleatorio en un rango específico utilizando métodos de la clase Integer.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        // Definir el rango
        int rangoInicial = 1;
        int rangoFinal = 100;

        // Generar un número aleatorio en el rango
        int numeroAleatorio = generarNumeroAleatorio(rangoInicial, rangoFinal);

        // Mostrar el número aleatorio
        System.out.println("Número aleatorio en el rango [" + rangoInicial + ", " + rangoFinal + "]: " + numeroAleatorio);
    }

    private static int generarNumeroAleatorio(int rangoInicial, int rangoFinal) throws IllegalArgumentException {
        if (rangoInicial > rangoFinal) {
            throw new IllegalArgumentException("El rango inicial debe ser menor o igual al rango final.");
        }

        Random random = new Random();
        return random.nextInt(rangoFinal - rangoInicial + 1) + rangoInicial;
    }
}
