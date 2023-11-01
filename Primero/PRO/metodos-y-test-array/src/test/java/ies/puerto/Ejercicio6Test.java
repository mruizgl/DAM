package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6;

    @BeforeEach
    public void before() {
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void matrizTranspuestaTest() {
        int[] array = {1, 2, 3, 4, 5};
        int valorABuscar = 2;

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizTranspuestaEsperada = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int[][] matrizTranspuesta = Ejercicio6.encontrarMatrizTranspuesta(matriz);

        Assertions.assertEquals(matrizTranspuestaEsperada, matrizTranspuesta, "No se obtuvo el resultado esperado. ");
    }
}
