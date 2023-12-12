package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio1Test {
    @Test
    public void invertirCadenaTest() {
        String cadena = "Feliz Navidad";
        String cadenaInvertida = Ejercicio1.invertirCadena(cadena);
        Assertions.assertEquals("dadivaN zileF", cadenaInvertida, "El resultado obtenido no es el esperado");
    }
}
