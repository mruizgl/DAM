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
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.negocio.dto.EquipamientoDTO;

class ServicioEquipamientoTest {
    EquipamientoServicio equipamientoServicio;
    @Mock
    DaoEquipamiento daoEquipamientoMock;


    @BeforeEach
    public void init() throws MarvelException{
        MockitoAnnotations.openMocks(this);
        equipamientoServicio = new EquipamientoServicio();
        equipamientoServicio.setDaoEquipamiento(daoEquipamientoMock);
    }
    @Test
    void getAll() throws MarvelException{
        when(daoEquipamientoMock.findAllEquipamiento()).thenReturn(new HashSet<>());
        Response respueta = equipamientoServicio.getEsquipamientos();
        Assertions.assertNotNull(respueta);
        Assertions.assertEquals(200, respueta.getStatus());
    }
    @Test
    void getOne() throws MarvelException{
        when(daoEquipamientoMock.findEquipamiento(any(Equipamiento.class))).thenReturn(new Equipamiento());
        Response respueta = equipamientoServicio.getEquipamientoById("idA");
        Assertions.assertNotNull(respueta);
        Assertions.assertEquals(200, respueta.getStatus());
    }
    @Test
    void noEncontrado() throws MarvelException{
        when(daoEquipamientoMock.findEquipamiento(any(Equipamiento.class))).thenReturn(null);
        Response response = equipamientoServicio.getEquipamientoById("idB");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404,response.getStatus());
    }
    @Test
    void add() throws MarvelException{
        when(daoEquipamientoMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response response = equipamientoServicio.addEquipamiento(new EquipamientoDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(201, response.getStatus()); 
    }
    @Test
    void deleted () throws MarvelException{
        when(daoEquipamientoMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response response = equipamientoServicio.deletedEquipamiento( new EquipamientoDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204, response.getStatus()); 
    }
    @Test
    void deletedError() throws MarvelException{
        when(daoEquipamientoMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response response = equipamientoServicio.deletedEquipamiento( new EquipamientoDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404, response.getStatus()); 
    }
}
