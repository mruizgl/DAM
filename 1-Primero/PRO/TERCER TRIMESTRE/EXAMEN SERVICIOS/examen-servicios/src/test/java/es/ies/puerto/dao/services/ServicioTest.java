package es.ies.puerto.dao.services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.HashSet;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.impl.ClienteDAO;
import es.ies.puerto.services.ClienteService;

public class ServicioTest {
    
    ClienteService clienteService;

    @Mock
    ClienteDAO clienteDAOMock;

    @BeforeEach
    public void init() throws TiendaException{
        MockitoAnnotations.openMocks(this);
        clienteService = new ClienteService();
        clienteService.setClienteDAO(clienteDAOMock);
    }

    @Test
    void getAll() throws TiendaException{
        when(clienteDAOMock.findAll()).thenReturn(new HashSet<>());
        Response respuesta = clienteService.getAllclientes();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200, respuesta.getStatus()); 
    }
    @Test
    void getOne() throws TiendaException{
        when(clienteDAOMock.findById(any(ClienteEntity.class))).thenReturn(new ClienteEntity());
        Response respuesta = clienteService.getClieentebyId(2);
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200, respuesta.getStatus()); 
    }
    @Test
    void notFound() throws TiendaException{
        when(clienteDAOMock.findById(any(ClienteEntity.class))).thenReturn(null);
        Response respuesta = clienteService.getClieentebyId(2);
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404, respuesta.getStatus()); 
    }
    @Test
    void add() throws TiendaException{
        when(clienteDAOMock.update(any(ClienteEntity.class))).thenReturn(false);
        Response response = clienteService.save(new ClienteDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(201, response.getStatus());
    }
    @Test
    void delete () throws TiendaException{
        when(clienteDAOMock.delete(any(ClienteEntity.class))).thenReturn(true);
        Response response = clienteService.delete(new ClienteDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204, response.getStatus());
    }
    @Test
    void deleteError () throws TiendaException{
        when(clienteDAOMock.delete(any(ClienteEntity.class))).thenReturn(false);
        Response response = clienteService.delete(new ClienteDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404, response.getStatus());
    }
}
