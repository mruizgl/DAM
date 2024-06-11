package es.ies.puerto.services;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

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

public class EquipamientoServiceTest {
    EquipamientoService equipamientoService;
    public static final String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    public static final int STATUS_200 = 200;
    public static final int STATUS_404 = 404;
    public static final int STATUS_201 = 201;
    public static final int STATUS_304 = 304;
    public static final int STATUS_204 = 204;
    @Mock
    DaoEquipamiento daoMarvelMock;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
        equipamientoService = new EquipamientoService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllEquipamiento()).thenReturn(new HashSet<>());
        Response respuesta = equipamientoService.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findEquipamiento(any(Equipamiento.class))).thenReturn(new Equipamiento());
        Response respuesta = equipamientoService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findEquipamiento(any(Equipamiento.class))).thenReturn(null);
        Response respuesta = equipamientoService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoMarvelMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = equipamientoService.addObject(new EquipamientoDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = equipamientoService.addObject(new EquipamientoDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = equipamientoService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = equipamientoService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }
}
