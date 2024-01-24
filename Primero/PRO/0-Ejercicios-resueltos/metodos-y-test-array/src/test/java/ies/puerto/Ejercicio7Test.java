package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7;

    @BeforeEach
    public void before() {
        ejercicio7 = new Ejercicio7();
    }

    @Test
    public void ordenarArrayAscendenteTest() {
        int[] array = {64, 25, 12, 22, 11};
        int[] arrayOrdenado = {11, 12, 22, 25, 64};

        ejercicio7.ordenarArrayAscendente(array);

        Assertions.assertEquals(arrayOrdenado, array, "No se ha obtenido el resultado esperado. ");
    }
}