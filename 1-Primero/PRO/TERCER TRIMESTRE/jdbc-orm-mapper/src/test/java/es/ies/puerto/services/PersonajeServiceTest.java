package es.ies.puerto.services;


import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
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

public class PersonajeServiceTest {

    @Mock
    private DaoPersonaje daoPersonaje;

    @InjectMocks
    private PersonajeService personajeService;

    @BeforeEach
    public void setUp() throws MarvelException {
        MockitoAnnotations.initMocks(this);
        personajeService = new PersonajeService(daoPersonaje);
    }

    @Test
    void testGetObjectById_Success() throws MarvelException {
        String id = "1";
        Personaje personaje = new Personaje(id);
        PersonajeDTO personajeDTO = new PersonajeDTO(id);

        when(daoPersonaje.findPersonaje(any(Personaje.class))).thenReturn(personaje);
        when(IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(personaje)).thenReturn(personajeDTO);

        Response response = personajeService.getObjectById(id);

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());

    }

    @Test
    public void testGetObjectById_NotFound() throws MarvelException {
        String id = "1";

        when(daoPersonaje.findPersonaje(any(Personaje.class))).thenReturn(null);

        Response response = personajeService.getObjectById(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetAll() throws MarvelException {
        Set<Personaje> personajes = new HashSet<>();
        personajes.add(new Personaje("1"));
        personajes.add(new Personaje("2"));

        Set<PersonajeDTO> personajeDTOs = new HashSet<>();
        personajeDTOs.add(new PersonajeDTO("1"));
        personajeDTOs.add(new PersonajeDTO("2"));

        when(daoPersonaje.findAllPersonaje()).thenReturn(personajes);
        when(IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(any(Personaje.class)))
                .thenAnswer(invocation -> {
                    Personaje personaje = invocation.getArgument(0);
                    return new PersonajeDTO(personaje.getId());
                });

        Response response = personajeService.getAll();

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void testAddObject_Success() throws MarvelException {
        PersonajeDTO personajeDTO = new PersonajeDTO("1");
        Personaje personaje = new Personaje("1");

        when(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO)).thenReturn(personaje);
        when(daoPersonaje.updatePersonaje(personaje)).thenReturn(true);

        Response response = personajeService.addObject(personajeDTO);

        Assertions.assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testAddObject_NotModified() throws MarvelException {
        PersonajeDTO personajeDTO = new PersonajeDTO("1");
        Personaje personaje = new Personaje("1");

        when(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO)).thenReturn(personaje);
        when(daoPersonaje.updatePersonaje(personaje)).thenReturn(false);

        Response response = personajeService.addObject(personajeDTO);

        Assertions.assertEquals(Response.Status.NOT_MODIFIED.getStatusCode(), response.getStatus());
    }

    @Test
    public void testDeleteObjectById_Success() throws MarvelException {
        String id = "1";
        Personaje personaje = new Personaje(id);

        when(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(any(PersonajeDTO.class))).thenReturn(personaje);
        when(daoPersonaje.deletePersonaje(personaje)).thenReturn(true);

        Response response = personajeService.deleteObjectById(id);

        Assertions.assertEquals(Response.Status.NO_CONTENT.getStatusCode(), response.getStatus());
    }

    @Test
    public void testDeleteObjectById_NotFound() throws MarvelException {
        String id = "1";
        Personaje personaje = new Personaje(id);

        when(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(any(PersonajeDTO.class))).thenReturn(personaje);
        when(daoPersonaje.deletePersonaje(personaje)).thenReturn(false);

        Response response = personajeService.deleteObjectById(id);

        Assertions.assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
    }

    @Test
    public void testGetObjectXml_Success() throws MarvelException {
        String id = "1";
        Personaje personaje = new Personaje(id);
        PersonajeDTO personajeDTO = new PersonajeDTO(id);

        when(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO)).thenReturn(personaje);
        when(daoPersonaje.findPersonaje(personaje)).thenReturn(personaje);

        Response response = personajeService.getObjectXml(id);

        Assertions.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

}
