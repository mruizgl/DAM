package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1;
    @BeforeEach
    public void before() { ejercicio1 = new Ejercicio1(); }

    @Test
    public void sumaEnterosTestOk() {
        int suma = ejercicio1.sumaEnteros();
        Assertions.assertEquals(15, suma, "No se ha obtenido el resultado esperado");
    }


}
