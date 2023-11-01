package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4;

    @BeforeEach
    public void before() {
        ejercicio4 = new Ejercicio4();
    }

    @Test
    public void testEncontrarNumeroMayor() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int paresOk = Ejercicio4.obtenerPar();

        Assertions.assertEquals(5, paresOk, "No se ha obtenido el resultado esperado");
    }
}
