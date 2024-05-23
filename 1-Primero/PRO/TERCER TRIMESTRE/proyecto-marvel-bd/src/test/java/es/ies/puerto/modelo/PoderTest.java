package es.ies.puerto.modelo;

import es.ies.puerto.Poder;
import es.ies.puerto.exception.PersonajeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoderTest {
    private Poder poder;

    @BeforeEach
    public void beforeEach() throws PersonajeException {

        poder = new Poder("PoderTest");
    }

    @Test
    public void getPersonajeIdTest() {
        poder.setPersonajeId(1);
        Assertions.assertEquals(1, poder.getPersonajeId());
    }

    @Test
    public void setPersonajeIdTest() {
        poder.setPersonajeId(2);
        Assertions.assertEquals(2, poder.getPersonajeId());
    }

    @Test
    public void getPoderTest() {
        Assertions.assertEquals("PoderTest", poder.getPoder());
    }

    @Test
    public void setPoderTest() {
        poder.setPoder("NuevoPoderTest");
        Assertions.assertEquals("NuevoPoderTest", poder.getPoder());
    }

}
