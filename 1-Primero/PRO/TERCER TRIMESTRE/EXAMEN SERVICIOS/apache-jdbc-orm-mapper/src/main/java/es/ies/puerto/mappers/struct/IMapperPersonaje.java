package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {IMapperAlias.class, IMapperEquipamiento.class, IMapperPoder.class})
public interface IMapperPersonaje {
    IMapperPersonaje INSTANCE = Mappers.getMapper(IMapperPersonaje.class);
    Personaje personajeDTOToPersonaje(PersonajeDTO personajeDTO);
    PersonajeDTO personajeToPersonajeDTO(Personaje personaje);
}
