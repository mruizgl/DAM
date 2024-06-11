package es.ies.puerto.mapper;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class  ClienteMapper {
    public static ClienteDTO toDTO(ClienteEntity cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setEmail(cliente.getEmail());
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNombre(cliente.getNombre());
        return clienteDTO;
    }
    public static ClienteEntity toEntity(ClienteDTO clienteDTO){
        ClienteEntity cliente = new ClienteEntity();
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setId(clienteDTO.getId());
        cliente.setNombre(clienteDTO.getNombre());
        return cliente;
    }
}
