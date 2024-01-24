package ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    @Test
    public void comprobarSumatorioOk () {

        Assertions.assertEquals(Ejercicio1.calcularSumatorio(3), 6, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void comprobarCreacionPersona () {
        Persona persona1 = new Persona("Juan", 23, "Pérez");
        Assertions.assertEquals(persona1.getNombre(), "Juan");
        Assertions.assertEquals(persona1.getApellidos(), "Pérez");
        Assertions.assertEquals(persona1.getEdad(), 23);
    }

    @Test
    public void comprobarEdad () {
        Persona persona1 = new Persona("Juan", -6, "Pérez");
        Assertions.assertEquals(persona1.getEdad(), 0);
    }

    @Test
    public void comprobarNombre () {
        Persona persona1 = new Persona("Juan", -6, "Pérez");
        Assertions.assertEquals(persona1.getNombre(), "Juan");
        persona1.setNombre("María");
        Assertions.assertEquals(persona1.getNombre(), "María");

    }
}
