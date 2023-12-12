package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    @Test
    public void contarVocalesTest () {
        String cadena = "hola";
        int contarCadena = Ejercicio2.contarVocales(cadena);
        int resultado = 2;
        Assertions.assertEquals(resultado, contarCadena, "No se ha obtenido el resultado esperado");
    }
}
