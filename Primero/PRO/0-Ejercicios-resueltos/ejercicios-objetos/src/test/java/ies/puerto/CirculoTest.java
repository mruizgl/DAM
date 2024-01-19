package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {
    int radio = 20;
    Circulo circulo;
    @BeforeEach
    public void before() {
        circulo = new Circulo(radio);
    }

    @Test
    public void constructorTestOk() {
        Circulo resultado = new Circulo(radio);
        Assertions.assertEquals(radio, circulo.getRadio(), "No se ha obtenido el resultado esperado");
    }
    @Test
    public void calcularAreaTest() {
        double resultado = circulo.calcularArea();
        assertEquals(resultado, circulo.calcularArea(), "No se ha obtenido el resultado esperado");
    }
    @Test
    public void calcularCircunferenciaTest() {
        double circunferencia = circulo.calcularCircunferencia();
        assertEquals(circunferencia, circulo.calcularCircunferencia(), "No se ha obtenido el resultado esperado");
    }
    @Test
    public void setRadioTestOk() {
        double miradio = radio;
        circulo.setRadio(miradio);
        assertEquals(miradio, circulo.getRadio(), "No se ha obtenido el resultado esperado");
    }
}

