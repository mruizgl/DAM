package ies.puerto;

/**
 * Clase que obtiene números pares y los muestra en pantalla
 * @author Melissa Ruiz
 */
public class Ejercicio4 {

    /**
     * Método que muestra los numeros pares
     * @param args Muestra numeros pares
     */
    public static void main(String[] args) {
        System.out.println("Los numeros pares son: " + obtenerPar());
    }

    /**
     * Método que obtiene la cantidad de números pares que hay en un array
     * @return Devuelve cantidad de pares
     */
    public static int obtenerPar() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int pares = 0;

        for (int i : numeros) {
            if (i % 2  == 0) {
                pares++;
            }
        }
        return pares;
    }

}

