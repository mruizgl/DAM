package ies.puerto;

/**
 * Clase que determina si un numero es primo o no
 * @author Melissa Ruiz
 */
public class Ejercicio5 {
    /**
     * Funcion que determina si un numero es primo o no.
     * @param numero El numero que miramos si es primo o no.
     * @return Devuelve resultado
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }


        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}