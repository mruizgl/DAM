package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {

    Ejercicio8 ejercicio8;

    @BeforeEach
    public void before() {
        ejercicio8 = new Ejercicio8();
    }

    @Test
    public void testEliminarDuplicados() {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int[] resultadoEsperado = {1, 2, 3, 4, 5, 6, 7};

        int[] resultado = Ejercicio8.eliminarDuplicados(array);

        Assertions.assertEquals(resultadoEsperado, resultado, "No se ha obtenido el resultado esperado. ");

    }
}