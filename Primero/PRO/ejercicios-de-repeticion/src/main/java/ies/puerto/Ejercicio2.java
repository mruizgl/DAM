package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 */
public class Ejercicio2 {

    public boolean esPrimo(int valor) {
        int [] array = new int[200];
        for (int i = 2; i < array.length; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

}
