package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;


public class MapperPersonaje {

    public static PersonajeDTO personajeToPersonajeDTO(Personaje personaje){
        if (personaje == null){
            return null;
        }
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(personaje.getId());
        personajeDTO.setNombre(personaje.getNombre());
        personajeDTO.setGenero(personaje.getGenero());
        personajeDTO.setPoderes(personaje.getPoderes());
        personajeDTO.setEquipamientos(personaje.getEquipamientos());
        personajeDTO.setAlias(personaje.getAlias());

        return personajeDTO;
    }

    public static Personaje personajeDTOToPersonaje(PersonajeDTO personajeDTO){
        if (personajeDTO == null){
            return null;
        }

        Personaje personaje = new Personaje();
        personaje.setId(personajeDTO.getId());
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setGenero(personajeDTO.getGenero());
        personaje.setPoderes(personajeDTO.getPoderes());
        personaje.setEquipamientos(personajeDTO.getEquipamientos());
        personaje.setAlias(personajeDTO.getAlias());

        return personaje;
    }
}
