package es.ies.puerto.mappers.classic;


import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;


public class MapperPoder {

    public static PoderDTO poderToPoderDTO(Poder poder){
        if (poder == null){
            return null;
        }
        PoderDTO poderDTO = new PoderDTO();
        poderDTO.setId(poder.getId());
        poderDTO.setNombre(poder.getNombre());
        return poderDTO;
    }

    public static Poder poderDTOToPoder(PoderDTO poderDTO){
        if (poderDTO == null){
            return null;
        }
        Poder poder = new Poder();
        poder.setId(poderDTO.getId());
        poder.setNombre(poderDTO.getNombre());
        return poder;
    }


}
