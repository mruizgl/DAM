package es.ies.puerto.mappers.classic;

import java.util.Set;

import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.negocio.dto.PersonajeDTO;


public class MappersPersonaje {
    
    public static Personaje DTOtoPersonaje(PersonajeDTO personajeDTO ){
        if (personajeDTO == null) {
            return  null;
        }
        Personaje personaje = new Personaje();
        personaje.setId(personajeDTO.getId());
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setAlias(personajeDTO.getAlias());
        personaje.setGenero(personajeDTO.getGenero());
        personaje.setEquipamientos(personajeDTO.getEquipamientos());
        personaje.setPoderes(personajeDTO.getPoderes());
        return personaje;
    }
    public static PersonajeDTO personajeToDTO(Personaje personaje ){
        if (personaje == null) {
            return  null;
        }
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(personaje.getId());
        personajeDTO.setNombre(personaje.getNombre());
        personajeDTO.setAlias(personaje.getAlias());
        personajeDTO.setGenero(personaje.getGenero());
        personajeDTO.setEquipamientos(personaje.getEquipamientos());
        personajeDTO.setPoderes(personaje.getPoderes());
        return personajeDTO;
    }
}
