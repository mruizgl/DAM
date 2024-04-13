package es.ies.puerto.modelo;

import es.ies.puerto.Personaje;
import es.ies.puerto.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class PersonajeTest {
    private Personaje personaje;

    @BeforeEach
    public void beforeEach() throws Exception {
        personaje = new Personaje(5);
    }

    @Test
    public void getIdTest() {
        Assertions.assertEquals(5, personaje.getId());
    }

    @Test
    public void setIdTest() {
        personaje.setId(6);
        Assertions.assertEquals(6, personaje.getId());
    }

    @Test
    public void getNombreTest() {
        personaje.setNombre("NombreTest");
        Assertions.assertEquals("NombreTest", personaje.getNombre());
    }

    @Test
    public void setNombreTest() {
        personaje.setNombre("NuevoNombreTest");
        Assertions.assertEquals("NuevoNombreTest", personaje.getNombre());
    }

    @Test
    public void getAliasTest() {
        personaje.setAlias("AliasTest");
        Assertions.assertEquals("AliasTest", personaje.getAlias());
    }

    @Test
    public void setAliasTest() {
        personaje.setAlias("NuevoAliasTest");
        Assertions.assertEquals("NuevoAliasTest", personaje.getAlias());
    }

    @Test
    public void getGeneroTest() {
        personaje.setGenero("GeneroTest");
        Assertions.assertEquals("GeneroTest", personaje.getGenero());
    }

    @Test
    public void setGeneroTest() {
        personaje.setGenero("NuevoGeneroTest");
        Assertions.assertEquals("NuevoGeneroTest", personaje.getGenero());
    }

    @Test
    public void getPoderesTest() {
        Set<Poder> poderes = new HashSet<>();
        poderes.add(new Poder(1, "Poder1"));
        personaje.setPoderes(poderes);
        Assertions.assertEquals(poderes, personaje.getPoderes());
    }

    @Test
    public void setPoderesTest() {
        Set<Poder> poderes = new HashSet<>();
        poderes.add(new Poder(2, "Poder2"));
        personaje.setPoderes(poderes);
        Assertions.assertEquals(poderes, personaje.getPoderes());
    }
}
