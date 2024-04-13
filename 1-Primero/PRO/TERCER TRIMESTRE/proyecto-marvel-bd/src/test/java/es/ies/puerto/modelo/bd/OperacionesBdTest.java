package es.ies.puerto.modelo.bd;

import es.ies.puerto.Personaje;
import es.ies.puerto.Poder;
import es.ies.puerto.db.OperacionesBd;
import es.ies.puerto.exception.PersonajeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personajePrueba;
    Set<Poder> poderes = new HashSet<>();
    @BeforeEach
    public void beforeEach() {
        try {
            Poder poder = new Poder("maquina");
            poderes.add(poder);
            personajePrueba = new Personaje(3, "dkslfm","pepe","hombre",poderes);
            operacionesBd = new OperacionesBd(urlBd);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerPersonajeAllTest() {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }


    }

    @Test
    public void insertarPersonajeTest() {
        try {
            operacionesBd.insertarPersonaje(personajePrueba);
            int idPersonaje = personajePrueba.getId();
            Assertions.assertTrue(idPersonaje == 3);
            Assertions.assertNotNull(personajePrueba);
            Assertions.assertEquals(3, personajePrueba.getId(), MESSAGE_ERROR);
            Assertions.assertEquals("dkslfm", personajePrueba.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals("pepe", personajePrueba.getAlias(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void actualizarPersonajeTest() {
        personajePrueba.setNombre("NuevoNombreTest");
        try {
            operacionesBd.actualizarPersonaje(personajePrueba);
            Assertions.assertEquals("NuevoNombreTest", personajePrueba.getNombre(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void eliminarPersonajeTest() {
        try {
            operacionesBd.eliminarPersonaje(personajePrueba);
            Assertions.assertNotNull(personajePrueba);
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void insertarPoderesTest() {
        Personaje nuevoPersonaje = new Personaje(5, "NombreTest", "AliasTest", "GeneroTest", new HashSet<>());

        try {
            operacionesBd.insertarPersonaje(nuevoPersonaje);
            Set<Poder> poderes = new HashSet<>();
            poderes.add(new Poder("Poder1"));
            poderes.add(new Poder("Poder2"));
            poderes.add(new Poder("Poder3"));

            int idPersonaje = 5;
            operacionesBd.insertarPoderes(poderes, idPersonaje);
            Set<Poder> poderesRecuperados = operacionesBd.obtenerPoderesSet(idPersonaje);

            Assertions.assertEquals(poderes, poderesRecuperados, MESSAGE_ERROR);

            operacionesBd.eliminarPoderesPorIdPersonaje(idPersonaje);
            Set<Poder> poderesEliminados = operacionesBd.obtenerPoderesSet(idPersonaje);
            Assertions.assertTrue(poderesEliminados.isEmpty(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }
    }


}
