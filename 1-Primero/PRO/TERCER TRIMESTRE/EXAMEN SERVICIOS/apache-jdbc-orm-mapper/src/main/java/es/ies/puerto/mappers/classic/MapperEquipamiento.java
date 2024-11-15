package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MapperEquipamiento {
    public static EquipamientoDTO equipamientoToEquipamientoDTO(Equipamiento equipamiento){
        if (equipamiento == null){
            return null;
        }
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(equipamiento.getId());
        equipamientoDTO.setNombre(equipamiento.getNombre());
        equipamientoDTO.setDescripcion(equipamiento.getDescripcion());
        equipamientoDTO.setPersonaje_id(equipamiento.getPersonaje_id());
        return equipamientoDTO;
    }

    public static Equipamiento equipamientoDTOToEquipamiento(EquipamientoDTO equipamientoDTO){
        if (equipamientoDTO == null){
            return null;
        }
        Equipamiento equipamiento = new Equipamiento();
        equipamiento.setId(equipamientoDTO.getId());
        equipamiento.setNombre(equipamientoDTO.getNombre());
        equipamiento.setDescripcion(equipamientoDTO.getDescripcion());
        equipamiento.setPersonaje_id(equipamientoDTO.getPersonaje_id());
        return equipamiento;
    }
}