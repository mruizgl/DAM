package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {

    Ejercicio10 ejercicio10;

    @BeforeEach
    public void before() {
        ejercicio10 = new Ejercicio10();
    }
    @Test
    public void esMatrizDiagonalTest() {
        int[][] matrizDiagonal = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        };

        int[][] matrizNoDiagonal = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 1, 3}
        };

        Assertions.assertTrue(ejercicio10.esMatrizDiagonal(matrizDiagonal));
        Assertions.assertFalse(ejercicio10.esMatrizDiagonal(matrizNoDiagonal));
    }
}
