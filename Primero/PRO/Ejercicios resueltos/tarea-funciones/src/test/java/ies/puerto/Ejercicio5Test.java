package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5;

    @BeforeEach
    public void before() {
        ejercicio5 = new Ejercicio5();
    }

    @Test
    public void esPrimoTestTrue() {
        Assertions.assertTrue(Ejercicio5.esPrimo(2));
        Assertions.assertTrue(Ejercicio5.esPrimo(7));

    }

    @Test
    public void esPrimoTestFalse() {
        Assertions.assertFalse(Ejercicio5.esPrimo(4));
        Assertions.assertFalse(Ejercicio5.esPrimo(15));

    }
}