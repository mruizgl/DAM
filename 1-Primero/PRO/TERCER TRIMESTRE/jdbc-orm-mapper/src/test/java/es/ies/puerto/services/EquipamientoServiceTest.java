package es.ies.puerto.services;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.Before;
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
    @Mock
    private DaoEquipamiento daoEquipamiento;

    @InjectMocks
    private EquipamientoService equipamientoService;

    @BeforeEach
    public void setUp() throws MarvelException {
        MockitoAnnotations.initMocks(this);
        equipamientoService = new EquipamientoService(daoEquipamiento);
    }

    @Test
    public void testGetObjectById_Success() throws MarvelException {
        String id = "1";
        Equipamiento equipamiento = new Equipamiento(id);
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO(id);

        when(daoEquipamiento.findEquipamiento(any(Equipamiento.class))).thenReturn(equipamiento);
        when(IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(equipamiento)).thenReturn(equipamientoDTO);

        Response response = equipamientoService.getObjectById(id);

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectById_NotFound() throws MarvelException {
        String id = "1";

        when(daoEquipamiento.findEquipamiento(any(Equipamiento.class))).thenReturn(null);

        Response response = equipamientoService.getObjectById(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetAll() throws MarvelException {
        Set<Equipamiento> equipamientos = new HashSet<>();
        equipamientos.add(new Equipamiento("1"));
        equipamientos.add(new Equipamiento("2"));

        Set<EquipamientoDTO> equipamientoDTOs = new HashSet<>();
        equipamientoDTOs.add(new EquipamientoDTO("1"));
        equipamientoDTOs.add(new EquipamientoDTO("2"));

        when(daoEquipamiento.findAllEquipamiento()).thenReturn(equipamientos);
        when(IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(any(Equipamiento.class)))
                .thenAnswer(invocation -> {
                    Equipamiento equipamiento = invocation.getArgument(0);
                    return new EquipamientoDTO(equipamiento.getId());
                });

        Response response = equipamientoService.getAll();

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testAddObject_Success() throws MarvelException {
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO("1");
        Equipamiento equipamiento = new Equipamiento("1");

        when(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO)).thenReturn(equipamiento);
        when(daoEquipamiento.updateEquipamiento(equipamiento)).thenReturn(true);

        Response response = equipamientoService.addObject(equipamientoDTO);

        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testAddObject_NotModified() throws MarvelException {
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO("1");
        Equipamiento equipamiento = new Equipamiento("1");

        when(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO)).thenReturn(equipamiento);
        when(daoEquipamiento.updateEquipamiento(equipamiento)).thenReturn(false);

        Response response = equipamientoService.addObject(equipamientoDTO);

        Assertions.assertEquals(Response.Status.NOT_MODIFIED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testDeleteObjectById_Success() throws MarvelException {
        String id = "1";
        Equipamiento equipamiento = new Equipamiento(id);

        when(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(any(EquipamientoDTO.class))).thenReturn(equipamiento);
        when(daoEquipamiento.deleteEquipamiento(equipamiento)).thenReturn(true);

        Response response = equipamientoService.deleteObjectById(id);

        Assertions.assertEquals(Response.Status.NO_CONTENT.getStatusCode(), response.getStatus());
    }

    @Test
    public void testDeleteObjectById_NotFound() throws MarvelException {
        String id = "1";
        Equipamiento equipamiento = new Equipamiento(id);

        when(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(any(EquipamientoDTO.class))).thenReturn(equipamiento);
        when(daoEquipamiento.deleteEquipamiento(equipamiento)).thenReturn(false);

        Response response = equipamientoService.deleteObjectById(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectXml_Success() throws MarvelException {
        String id = "1";
        Equipamiento equipamiento = new Equipamiento(id);
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO(id);

        when(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO)).thenReturn(equipamiento);
        when(daoEquipamiento.findEquipamiento(equipamiento)).thenReturn(equipamiento);

        Response response = equipamientoService.getObjectXml(id);

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectXml_NotFound() throws MarvelException {
        String id = "1";
        Equipamiento equipamiento = new Equipamiento(id);
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO(id);

        when(IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO)).thenReturn(equipamiento);
        when(daoEquipamiento.findEquipamiento(equipamiento)).thenReturn(null);

        Response response = equipamientoService.getObjectXml(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }
}
