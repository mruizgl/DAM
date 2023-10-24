package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4;
    @BeforeEach
    public void before() {
        ejercicio4 = new Ejercicio4();
    }
    @Test
    public void testCalcularMaximoDosNumeros() {
        double resultado = Ejercicio4.calcularMaximo(5.0, 8.0);
        Assertions.assertEquals(8.0, resultado, 0.001);
    }

    @Test
    public void testCalcularMaximoTresNumeros() {
        double resultado = Ejercicio4.calcularMaximo(5.0, 8.0, 3.0);
        Assertions.assertEquals(8.0, resultado, 0.001);
    }
}