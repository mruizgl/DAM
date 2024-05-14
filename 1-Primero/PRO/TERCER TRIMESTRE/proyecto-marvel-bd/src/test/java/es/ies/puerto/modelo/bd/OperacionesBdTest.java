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
    Personaje personaje;
    Set<Poder> poderes = new HashSet<>();
    @BeforeEach
    public void beforeEach() {
        try {
            Poder poder = new Poder("maquina");
            poderes.add(poder);
            personaje = new Personaje(3, "dkslfm","pepe","hombre",poderes);
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
       // try {
            //operacionesBd.insertarPersonaje(personaje);
            //Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            //Assertions.assertEquals(3, lista.size(), MESSAGE_ERROR);
            //Assertions.assertEquals(3, personaje.getId(), MESSAGE_ERROR);
            //Assertions.assertEquals("dkslfm", personaje.getNombre(), MESSAGE_ERROR);
            //Assertions.assertEquals("pepe", personaje.getAlias(), MESSAGE_ERROR);
            //Assertions.assertEquals("hombre", personaje.getGenero(), MESSAGE_ERROR);
            System.out.println(personaje.getPoderes());

       // } catch (PersonajeException e) {
       //     throw new RuntimeException(e);
       // }
    }

    @Test
    public void eliminarPersonajeTest() {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            operacionesBd.eliminarPersonaje(personaje);
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }

    }


}
