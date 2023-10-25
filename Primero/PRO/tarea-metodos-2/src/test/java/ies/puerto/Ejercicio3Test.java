package ies.puerto;

import ies.puerto.Ejercicio2;
import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3;

    @BeforeEach
    public void before() {
        ejercicio3 = new Ejercicio3();
    }

    @Test
    public void calcularSumaTest() {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = Ejercicio3.calcularSuma(numeros);
        Assertions.assertEquals(15, suma, "No se obtuvo el resultado esperado");
    }
}

