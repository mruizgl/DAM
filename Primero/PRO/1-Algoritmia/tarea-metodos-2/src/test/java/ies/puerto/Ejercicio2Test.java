package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2;
    @BeforeEach
    public void before() { ejercicio2 = new Ejercicio2(); }

    @Test
    public void esParTest () {
        boolean esParOk = ejercicio2.esPar(2, true);
        Assertions.assertTrue(esParOk);
        boolean esParNoOk = ejercicio2.esPar(3, false);
        Assertions.assertTrue(esParOk);
    }
    @Test
    public void esPositivoTest () {
        boolean esPositivoOk = ejercicio2.esPositivo(5, true);
        Assertions.assertTrue(esPositivoOk);
        boolean esPositivoNoOk = ejercicio2.esPositivo(-5, false);
        Assertions.assertTrue(esPositivoOk);
    }
}
