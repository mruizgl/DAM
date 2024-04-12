package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1;
    int resultado = 24;

    @BeforeEach
    public void beforeEach() {
        ejercicio1 = new Ejercicio1();
    }
    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(resultado, ejercicio1.factorialTradicional(4));
    }

    @Test
    public void ejercicio1RecursivoTest() {
        Assertions.assertEquals(resultado, ejercicio1.factorial(4));
    }
}
