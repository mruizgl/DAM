package ies.puerto;

/**
 * Clase que calcular el numero mayor y menor de un array
 * @author Melissa Ruiz
 */
public class Ejercicio3 {

    /**
     * Funcion que calcular el numero mayor de una Array
     * @return Devuelve el resultado
     */
    public int calcularMayor() {
        int[] numeros = {2, 3, 4, 1, 5};
        int numeroMayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }

        return numeroMayor;
    }

    /**
     * Funcion que calcula el numero menor de un Array
     * @return devuelve el resultado
     */
    public int calcularMenor() {
        int[] numeros = {2, 3, 4, 1, 5};
        int numeroMenor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        return numeroMenor;
    }
}
