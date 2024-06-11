package es.ies.puerto.mapper;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.PedidoEntity;
import org.mapstruct.factory.Mappers;

public class PedidoMapper {
    public static PedidoDTO toDTO(PedidoEntity pedido) {
        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setCantidad(pedido.getCantidad());
        pedidoDTO.setId(pedido.getId());
        return pedidoDTO;
    }
    public static PedidoEntity  toEntity(PedidoDTO pedidoDTO,ClienteDTO clienteDTO) {
        PedidoEntity pedido= new PedidoEntity();
        pedido.setCantidad(pedidoDTO.getCantidad());
        pedido.setId(pedidoDTO.getId());
        pedido.setProducto(pedidoDTO.getProducto());
        pedido.setClienteId(clienteDTO.getId());
        return pedido;
    }
}
