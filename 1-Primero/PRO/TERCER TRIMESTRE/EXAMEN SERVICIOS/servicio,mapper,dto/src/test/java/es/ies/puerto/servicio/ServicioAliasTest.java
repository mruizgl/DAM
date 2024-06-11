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
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.negocio.dto.AliasDTO;

class ServicioAliasTest {
    AliasServicio aliasServicio;

    @Mock
    DaoAlias DaoAliasMock;

    @BeforeEach
    public void init() throws MarvelException{
        MockitoAnnotations.openMocks(this);
        aliasServicio = new AliasServicio();
        aliasServicio.setDaoAlias(DaoAliasMock);
    }
    @Test
    void getAll() throws MarvelException{
        when(DaoAliasMock.findAllAlias()).thenReturn(new HashSet<>());
        Response respueta = aliasServicio.getAlias();
        Assertions.assertNotNull(respueta);
        Assertions.assertEquals(200, respueta.getStatus());
    }
    @Test
    void  getOne() throws MarvelException{
        when(DaoAliasMock.findAlias(any(Alias.class))).thenReturn(new Alias());
        Response response = aliasServicio.getAliasById("idA");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.getStatus());
    }
    @Test
    void noEncontrado() throws MarvelException{
        when(DaoAliasMock.findAlias(any(Alias.class))).thenReturn(null);
        Response response = aliasServicio.getAliasById("idB");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404,response.getStatus());
    }
    @Test
    void add() throws MarvelException{
        when(DaoAliasMock.updateAlias(any(Alias.class))).thenReturn(false);
        Response response = aliasServicio.addAlias(new AliasDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(201, response.getStatus()); 
    }
    @Test
    void deleted () throws MarvelException{
        when(DaoAliasMock.deleteAlias(any(Alias.class))).thenReturn(true);
        Response response = aliasServicio.deleteAlias( new AliasDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204, response.getStatus()); 
    }
    @Test
    void deletedError() throws MarvelException{
        when(DaoAliasMock.deleteAlias(any(Alias.class))).thenReturn(false);
        Response response = aliasServicio.deleteAlias( new AliasDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404, response.getStatus()); 
    }
}
