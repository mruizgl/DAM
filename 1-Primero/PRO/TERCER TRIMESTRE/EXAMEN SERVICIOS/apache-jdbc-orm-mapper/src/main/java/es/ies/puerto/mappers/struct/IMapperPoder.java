package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);
    Poder poderDTOToPoder(PoderDTO poderDTO);
    PoderDTO  poderToPoderDTO(Poder poder);

}
