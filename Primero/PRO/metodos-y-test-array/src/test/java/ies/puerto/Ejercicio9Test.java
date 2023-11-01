import ies.puerto.Ejercicio9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {

    Ejercicio9 ejercicio9;

    @BeforeEach
    public void before() {
        ejercicio9 = new Ejercicio9();
    }

    @Test
    public void testCombinarArraysOrdenados() {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] resultadoEsperado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] resultado = Ejercicio9.combinarArraysOrdenados(array1, array2);

        Assertions.assertEquals(resultadoEsperado, resultado, "No se ha obtenido el resultado esperado.");
    }
}