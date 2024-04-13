package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;
    @BeforeEach
    public void beforeEach() {
        ejercicio2 = new Ejercicio2();
    }
    @Test
    public void ejercicio2Test() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<Integer> resultado;
        resultado = ejercicio2.cuentaDescendente(10);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void ejercicio2RecursivoTest() {
        List<Integer> resultadoEsperado = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<Integer> resultado;
        resultado = ejercicio2.cuentaDescendenteRecursiva(10);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

}
