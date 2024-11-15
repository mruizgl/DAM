package es.ies.puerto.services;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PoderServiceTest {
    PoderService poderService;
    public static final String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    public static final int STATUS_200 = 200;
    public static final int STATUS_404 = 404;
    public static final int STATUS_201 = 201;
    public static final int STATUS_304 = 304;
    public static final int STATUS_204 = 204;

    @Mock
    DaoPoder daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        PoderService poderService = new PoderService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllPoder()).thenReturn(new HashSet<>());
        Response respuesta = poderService.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findPoder(any(Poder.class))).thenReturn(new Poder());
        Response respuesta = poderService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findPoder(any(Poder.class))).thenReturn(null);
        Response respuesta = poderService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoMarvelMock.updatePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = poderService.addObject(new PoderDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updatePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = poderService.addObject(new PoderDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deletePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = poderService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deletePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = poderService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }
}
