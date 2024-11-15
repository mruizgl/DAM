package es.ies.puerto.services;


import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PersonajeServiceTest {
    PersonajeService personajeService;
    public static final String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    public static final int STATUS_200 = 200;
    public static final int STATUS_404 = 404;
    public static final int STATUS_201 = 201;
    public static final int STATUS_304 = 304;
    public static final int STATUS_204 = 204;

    @Mock
    DaoPersonaje daoMarvelMock;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
        personajeService = new PersonajeService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllPersonaje()).thenReturn(new HashSet<>());
        Response respuesta = personajeService.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findPersonaje(any(Personaje.class))).thenReturn(new Personaje());
        Response respuesta = personajeService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findPersonaje(any(Personaje.class))).thenReturn(null);
        Response respuesta = personajeService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoMarvelMock.updatePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = personajeService.addObject(new PersonajeDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updatePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = personajeService.addObject(new PersonajeDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deletePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = personajeService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deletePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = personajeService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

}
