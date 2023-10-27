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
    public void horasTrabajadasTestOK() {
        float sueldo = ejercicio1.sueldoTrabajador(10); //aqui se pone lo que vamos a probar
        Assertions.assertEquals(100, sueldo, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void horasTrabajadas205Test() {
        float sueldo = ejercicio1.sueldoTrabajador(10.25f);
        Assertions.assertEquals(102.5, sueldo, "No se ha obtenido el resultado esperado");
    }

}