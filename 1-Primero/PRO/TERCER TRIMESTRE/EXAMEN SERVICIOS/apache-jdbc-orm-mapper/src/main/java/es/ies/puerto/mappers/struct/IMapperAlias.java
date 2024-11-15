package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);
    Alias aliasDTOToAlias(AliasDTO aliasDTO);
    AliasDTO aliasToAliasDTO(Alias alias);

}
