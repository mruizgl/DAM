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
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.modelo.impl.PedidoDAO;
import es.ies.puerto.services.PedidoService;

public class PedidoServiceTest {
    PedidoService pedidoService;

    @Mock
    PedidoDAO pedidoDAOMock;


    @BeforeEach
    public void init() throws TiendaException{
        MockitoAnnotations.openMocks(pedidoDAOMock);
        pedidoService = new PedidoService();
        pedidoService.setPedidoDAO(pedidoDAOMock);
    }
    
}
