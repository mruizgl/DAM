import ies.puerto.Ejercicio3;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();



    @Test

    public void comprobarEdadTestOk() throws Exception{

     Ejercicio3 persona = new Ejercicio3("Manolo","78781234F","31/10/1987");

    int resultadoOk = 36;
    int resultado = ejercicio3.mayorEdad();

        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");


    }
@Test
    public void informacionOkTest() throws Exception{

        Ejercicio3 persona = new Ejercicio3("Manolo","78781234F","31/10/1987");
        String resultadoOk = "Nombre: Manolo Dni: " ;
        String resultado = ejercicio3.informacion();
        Assertions.assertEquals(resultado,resultadoOk,"No es el resultado esperado");

    }



}
