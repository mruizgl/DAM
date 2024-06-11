package es.ies.puerto.mapper;

import org.junit.jupiter.api.BeforeEach;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;

public class HelperTest {
    final int idCliente =6;
    final int idPeido=6;
    final String nombrecliente= "otro";
    final int cantidad = 8;
    final String email = "otro@asd.com";
    final String producto = "producto";
    ClienteEntity clienteEntity;
    ClienteDTO clienteDTO;
    PedidoEntity pedidoEntity;
    PedidoDTO pedidoDTO;
    @BeforeEach
    public void beforeEach(){
        clienteDTO= new ClienteDTO(idCliente, nombrecliente, email);
        clienteEntity = new ClienteEntity(idCliente, nombrecliente, email);
        pedidoDTO = new PedidoDTO(idPeido, producto, cantidad);
        pedidoEntity = new PedidoEntity(idPeido, idCliente, producto, cantidad);
    }
}
