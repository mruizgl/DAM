package es.ies.puerto.jdbc;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.HashSet;

import es.ies.puerto.excepcion.UsuarioExcepcion;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.Personaje;
import es.ies.puerto.model.impl.Poder;
import es.ies.puerto.model.jdbc.CrudBd;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class JdbcTest {
    private static final String GENERO_TEST = "GeneroTest";
    private static final String PODER_TEST = "PoderTest";
    private static final String ALIAS_TEST = "AliasTest";
    private static final String NOMBRE_TEST = "NombreTest";
    CrudBd crud;
    Personaje personaje;
    Alias alias;
    Poder poder;

    @BeforeEach
    public void beforeEach()throws UsuarioExcepcion {
        crud = new CrudBd();
        personaje = new Personaje();
        alias = new Alias();
        poder = new Poder();

        alias.setPersonaje(personaje);
        alias.setAlias(ALIAS_TEST);

        poder.setPersonaje(new HashSet<>(Arrays.asList(personaje)));
        poder.setPoder(PODER_TEST);

        personaje.setNombre(NOMBRE_TEST);
        personaje.setAlias(alias);
        personaje.setGenero(GENERO_TEST);
        personaje.setPoderes(new HashSet<>(Arrays.asList(poder)));
        try {
            crud.agregarPersonaje(personaje);
        } catch (Exception e) {
            fail("Se ha producido un error en la insercion:"+e.getMessage());
        }
    }

    @Test
    public void agregarEliminarPersonajeTest()throws UsuarioExcepcion{
        Assertions.assertEquals(personaje, crud.obtenerPersonaje(personaje));
    }
    @Test
    public void actualizarPersonajeTest()throws UsuarioExcepcion{
        String aliasUpdate= "AliasUpdate";
        String poderUpdate= "PoderUpdate";
        String nombreUpdate= "NombreUpdate";
        alias.setAlias(aliasUpdate);
        poder.setPoder(poderUpdate);
        personaje.setNombre(nombreUpdate);

        crud.actualizarPersonaje(personaje);
        Personaje personajeActualizar = crud.obtenerPersonaje(personaje);
        Assertions.assertEquals(personaje, personajeActualizar);
        Assertions.assertEquals(nombreUpdate, personajeActualizar.getNombre());
        Assertions.assertEquals(aliasUpdate, personajeActualizar.getAlias().getAlias());
        Assertions.assertEquals(poderUpdate, personajeActualizar.getPoderes().iterator().next().getPoder());
    }

    @Test
    public void obtenerPoderesTest() throws UsuarioExcepcion{
        Assertions.assertEquals(3, crud.obtenerPoderes(1).size());
    }

    @Test
    public void obtenerAliasTest() throws UsuarioExcepcion{
        Alias aliasObtener = crud.obtenerAlias(1);
        Alias alias = new Alias(1, new Personaje(1), "Tony Stark");
        Assertions.assertEquals(alias, aliasObtener);
        Assertions.assertEquals(alias.getAlias(), aliasObtener.getAlias());
        Assertions.assertEquals(alias.getPersonaje(), aliasObtener.getPersonaje());
    }

    @Test
    public void obtenerPersonajesTest()throws UsuarioExcepcion{
        Assertions.assertEquals(3, crud.obtenerPersonajes().size());
    }

    @AfterEach
    public void afterEach() {
        if (personaje != null) {
            try {
                crud.eliminarPersonaje(personaje);
            } catch (UsuarioExcepcion e) {
                e.printStackTrace();
                fail("Se ha producido un error en la eliminacion:"+e.getMessage());
            }

        }
    }
}
