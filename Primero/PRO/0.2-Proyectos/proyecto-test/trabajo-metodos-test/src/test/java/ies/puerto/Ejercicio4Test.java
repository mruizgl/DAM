package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    @Test
    public void testBinario() {
        Integer numeroEntero = 345;
        String resultado = Ejercicio4.binario(numeroEntero);
        Assertions.assertEquals("101011001", resultado, "No se ha obtenido el resultado esperado");
    }
}
