package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5;

    @BeforeEach
    public void before() {
        ejercicio5 = new Ejercicio5();
    }

    @Test
    public void testEncontrarPosicionEnArray() {
        int[] array = {1, 2, 3, 4, 5};
        int valorABuscar = 2;

        int posicion = ejercicio5.encontrarPosicionEnArray(array, valorABuscar);

        Assertions.assertEquals(1, posicion, "No se ha obtenido el resultado esperado. ");
    }

    @Test
    public void testEncontrarPosicionEnArrayValorNoPresente() {
        int[] array = {1, 2, 3, 4, 5};
        int valorABuscar = 6;

        int posicion = ejercicio5.encontrarPosicionEnArray(array, valorABuscar);

        Assertions.assertEquals(-1, posicion);
    }
}
