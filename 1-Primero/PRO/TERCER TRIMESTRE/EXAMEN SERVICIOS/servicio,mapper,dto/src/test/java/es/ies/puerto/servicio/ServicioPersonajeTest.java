package es.ies.puerto.servicio;



import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

import java.util.HashSet;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;



import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.negocio.dto.PersonajeDTO;

class ServicioPersonajeTest {
    PersonajeServicio personajeServicio;

    @Mock
    DaoPersonaje daoPersonajeMock;

    @BeforeEach
    public void init() throws MarvelException{
        MockitoAnnotations.openMocks(this);
        personajeServicio = new PersonajeServicio();
        personajeServicio.setDaoPersonaje(daoPersonajeMock);
    }
    @Test
    void getAll() throws MarvelException{
        when(daoPersonajeMock.findAllPersonaje()).thenReturn(new HashSet<>());
        Response respueta = personajeServicio.getPersonajes();
        Assertions.assertNotNull(respueta);
        Assertions.assertEquals(200, respueta.getStatus());
    }
    @Test
    void  getOne() throws MarvelException{
        when(daoPersonajeMock.findPersonaje(any(Personaje.class))).thenReturn(new Personaje());
        Response response = personajeServicio.getPErsonateById("idA");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void noEncontrado() throws MarvelException{
        when(daoPersonajeMock.findPersonaje(any(Personaje.class))).thenReturn(null);
        Response response = personajeServicio.getPErsonateById("idB");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404,response.getStatus());
    }
    @Test
    void add() throws MarvelException{
        when(daoPersonajeMock.updatePersonaje(any(Personaje.class))).thenReturn(false);
        Response response = personajeServicio.addPersonaje(new PersonajeDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(201, response.getStatus()); 
    }
    @Test
    void deleted () throws MarvelException{
        when(daoPersonajeMock.deletePersonaje(any(Personaje.class))).thenReturn(true);
        Response response = personajeServicio.deletePersonaje( new PersonajeDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204, response.getStatus()); 
    }
    @Test
    void deletedError() throws MarvelException{
        when(daoPersonajeMock.deletePersonaje(any(Personaje.class))).thenReturn(false);
        Response response = personajeServicio.deletePersonaje( new PersonajeDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404, response.getStatus()); 
    }
}
