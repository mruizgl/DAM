package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3;
    @BeforeEach
    public void before() { ejercicio3 = new Ejercicio3(); }

    @Test
    public void testEncontrarNumeroMayor() {
        int[] numeros = {2, 3, 4, 1, 5};

        int numeroMenor = ejercicio3.calcularMayor();

        Assertions.assertEquals(5, numeroMenor, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void testEncontrarNumeroMenor() {
        int[] numeros = {2, 3, 4, 1, 5};

        int numeroMenor = ejercicio3.calcularMenor();

        Assertions.assertEquals(1, numeroMenor, "No se ha obtenido el resultado esperado");
    }
}


