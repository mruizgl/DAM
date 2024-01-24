package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6;

    @BeforeEach
    public void before() {
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void testFahrenheitACelsius() {
        // Prueba de conversión con un valor conocido
        double fahrenheit = 32.0;
        double celsius = Ejercicio6.fahrenheitACelsius(fahrenheit);
        Assertions.assertEquals(0, celsius, "El resultado no es el esperado");

    }
}