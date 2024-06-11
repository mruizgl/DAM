package es.ies.puerto.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;

public class MapperTest extends HelperTest{
    ClienteDTO clienteDTOTest;
    ClienteEntity clienteEntityTest;
    PedidoDTO pedidoDTOTest;
    PedidoEntity pedidoEntityTest;


    @Test
    public void mappersClienteTest(){
        clienteDTOTest = ClienteMapper.toDTO(clienteEntity);
        assertEquals( clienteDTO,clienteDTOTest);
        clienteEntityTest = ClienteMapper.toEntity(clienteDTO);
        assertEquals(clienteEntity, clienteEntityTest);
    }

    @Test 
    public void mapperPedidoTest(){
        pedidoDTOTest = PedidoMapper.toDTO(pedidoEntity);
        assertEquals(pedidoDTO, pedidoDTOTest);
        pedidoEntityTest = PedidoMapper.toEntity(pedidoDTO, clienteDTO);
        assertEquals(pedidoEntity, pedidoEntityTest);
    }
}
