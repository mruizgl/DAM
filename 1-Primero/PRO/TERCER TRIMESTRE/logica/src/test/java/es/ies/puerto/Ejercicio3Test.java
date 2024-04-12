package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3;
    int resultadoEperado = 55;
    @BeforeEach
    public void beforeEach () {
        ejercicio3 = new Ejercicio3();
    }

    @Test
    public void ejercicio3Test () {
        int resultado = ejercicio3.sumaNumerosTradicional(10);
        Assertions.assertEquals(resultadoEperado, resultado);
    }


}
