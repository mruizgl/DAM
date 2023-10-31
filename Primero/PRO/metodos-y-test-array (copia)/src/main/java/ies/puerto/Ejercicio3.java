package ies.puerto;

import java.lang.reflect.Array;

public class Ejercicio3 {

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
}
