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
    public void sumaEnterosTestOk() {
        float promedio = ejercicio2.promedioNumeros();
        Assertions.assertEquals(3.5f, promedio, "No se ha obtenido el resultado esperado");
    }


}
