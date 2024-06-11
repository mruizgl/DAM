package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromoTest {
    String cadena = "Dabale arroz a la zorra el abad";
    String cadenaFalse = "orvito";
    Palindromo palindromo;
    @BeforeEach
    public void beforeEach () {
        palindromo = new Palindromo();
    }

    @Test
    public void palindromoTest () {
        Assertions.assertTrue(palindromo.esPalindromo(cadena));
    }

    @Test
    public void palindromoFalseTest () {
        Assertions.assertFalse(palindromo.esPalindromo(cadenaFalse));
    }
}
