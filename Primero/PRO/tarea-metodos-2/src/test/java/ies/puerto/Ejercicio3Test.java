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
        int suma = ejercicio3.suma(10, 20);
        int resultado = suma + ejercicio3.suma(30, 10, 50);
        Assertions.assertEquals(120, resultado, "No se obtuvo el resultado esperado");
    }
}

