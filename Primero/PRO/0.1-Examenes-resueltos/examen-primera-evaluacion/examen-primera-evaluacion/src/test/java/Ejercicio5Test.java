import ies.puerto.Ejercicio5;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5;

    @Test
    public void Ejercicio5Test() {
        String esperado = "El mes es 4"; //Nota para profe: El mes numero 4 es abril
        String resultado = Ejercicio5.mesIfSele(4);

        Assertions.assertEquals(resultado, esperado , "No se ha obtenido el resultado esperado");
    }
}
