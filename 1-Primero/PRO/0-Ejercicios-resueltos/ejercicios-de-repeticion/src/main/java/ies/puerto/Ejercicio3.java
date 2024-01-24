package ies.puerto;

/**
 * Escribe un programa que busque el número 7 en un array, utilizando break.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                System.out.println("Número encontrado en la posicion: " + i);
                break;
            }
        }
    }

}

// Paso 1: Crear array.
// Paso 2: Rellenar array.
// Paso 3: Recorrer hasta encontrar 7 y entonces break