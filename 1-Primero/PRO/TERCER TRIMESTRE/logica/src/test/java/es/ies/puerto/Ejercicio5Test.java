package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5;
    int base = 2;
    int exponente = 3;
    int resultadoEsperado = 8;

    @BeforeEach
    public void beforeEach() {
        ejercicio5 = new Ejercicio5();
    }

    @Test
    public void ejercicio5Test () {
        int resultado = ejercicio5.potenciaTradicional(base, exponente);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void ejercicio5RecursivoTest () {
        int resultado = ejercicio5.potenciaRecursivo(base, exponente);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}
