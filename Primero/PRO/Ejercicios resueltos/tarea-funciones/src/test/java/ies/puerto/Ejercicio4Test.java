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
    public void calcularMaximoDosNumerosTest() {
        double resultado = Ejercicio4.calcularMaximo(5, 8);
        Assertions.assertEquals(8, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calcularMaximoTresNumerosTest() {
        int resultado = Ejercicio4.calcularMaximo(5, 8, 3);
        Assertions.assertEquals(8, resultado, "No se ha obtenido el resultado esperado");
    }
}