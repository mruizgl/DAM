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
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.dto.PoderDTO;

class ServicioPoderTest {
    PoderServicio poderServicio;

    @Mock
    DaoPoder daoPoderMock;

    @BeforeEach
    public void init() throws MarvelException{
        MockitoAnnotations.openMocks(this);
        poderServicio = new PoderServicio();
        poderServicio.setDaoPoder(daoPoderMock);
    }
    @Test
    void getAll() throws MarvelException{
        when(daoPoderMock.findAllPoder()).thenReturn(new HashSet<>());
        Response respueta = poderServicio.getPoderes();
        Assertions.assertNotNull(respueta);
        Assertions.assertEquals(200, respueta.getStatus());
    }
    @Test
    void  getOne() throws MarvelException{
        when(daoPoderMock.findPoder(any(Poder.class))).thenReturn(new Poder());
        Response response = poderServicio.getPoderById("idA");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void noEncontrado() throws MarvelException{
        when(daoPoderMock.findPoder(any(Poder.class))).thenReturn(null);
        Response response = poderServicio.getPoderById("idB");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404,response.getStatus());
    }
    @Test
    void add() throws MarvelException{
        when(daoPoderMock.updatePoder(any(Poder.class))).thenReturn(false);
        Response response = poderServicio.addPoder(new PoderDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(201, response.getStatus()); 
        //En este caso mi metodo daba false al insertar y true al actualizar 
        //ya que nuestro metodo era update, que insertaba en caso de que no existiera
        // o actualizaba si lo estaba en la base de datos
    }
    @Test
    void deleted () throws MarvelException{
        when(daoPoderMock.deletePoder(any(Poder.class))).thenReturn(true);
        Response response = poderServicio.deletePoder( "idC");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204, response.getStatus()); 
    }
    @Test
    void deletedError() throws MarvelException{
        when(daoPoderMock.deletePoder(any(Poder.class))).thenReturn(false);
        Response response = poderServicio.deletePoder( "idC");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404, response.getStatus()); 
    }
}
