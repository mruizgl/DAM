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
    public void sumaEnterosTestOk() {
        int numeroMayor = ejercicio3.calcularMayor();
        Assertions.assertEquals(5, numeroMayor, "No se ha obtenido el resultado esperado");
    }


}