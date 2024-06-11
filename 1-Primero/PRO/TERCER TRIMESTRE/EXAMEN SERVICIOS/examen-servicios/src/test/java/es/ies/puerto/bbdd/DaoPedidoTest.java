package es.ies.puerto.bbdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.modelo.impl.ClienteDAO;
import es.ies.puerto.modelo.impl.PedidoDAO;

public class DaoPedidoTest {
    static PedidoDAO pedidoDAO;
    final int id= 6;
    final  int idCliente=4;
    final String producto ="producto";
    final int cantida = 5;
    PedidoEntity pedidoEntity;
    @BeforeAll
    public static void beforeAll(){
        try {
            pedidoDAO= new PedidoDAO();
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void obtenerTodos() throws TiendaException{
        pedidoEntity = new PedidoEntity(id, idCliente, producto, cantida);
        pedidoDAO.update(pedidoEntity);
        assertEquals(pedidoDAO.findAll().size(), 4);
    }
    @Test
    public void obtener1() throws TiendaException{
        pedidoEntity = new PedidoEntity(id, idCliente, producto, cantida);
        pedidoDAO.update(pedidoEntity);
        PedidoEntity peridod2 = pedidoDAO.findById(pedidoEntity);
        assertEquals(pedidoEntity, peridod2);
    }
    @AfterEach
    public void afterEach() {
        try {
            pedidoDAO.delete(pedidoEntity);
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
        
        
    }
}
