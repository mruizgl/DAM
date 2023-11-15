package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Ejercicio3Test {
    double nota = 6;
    Ejercicio3 ejercicio3;
    @BeforeEach
    public void before() {
         ejercicio3 = new Ejercicio3();
    }

    @Test
    public void clasificacionEstudiantesTest() {
        String esperado = "Aprobado";
        String resultado = ejercicio3.clasificacionEstudiantes(5);
        Assertions.assertEquals(esperado,resultado, "No se ha obtenido el resultado esperado");
    }
}

