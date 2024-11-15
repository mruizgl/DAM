package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);
    Equipamiento equipamientoDTOToEquipamiento(EquipamientoDTO equipamientoDTO);
    EquipamientoDTO equipamientoToEquipamientoDTO(Equipamiento equipamiento);
}
