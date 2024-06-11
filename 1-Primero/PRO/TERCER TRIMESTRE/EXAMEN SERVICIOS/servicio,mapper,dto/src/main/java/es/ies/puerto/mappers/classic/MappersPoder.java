package es.ies.puerto.mappers.classic;

import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.dto.PoderDTO;

public class MappersPoder {
    
    public static Poder poderDTOTopoder(PoderDTO poderDTO){
        Poder poder;
        if (poderDTO==null) {
            return null;
        }
        poder= new Poder();
        poder.setNombre(poderDTO.getNombre());
        poder.setId(poderDTO.getId());
        return poder;
    }
    public static PoderDTO poderTopoderDTO(Poder poder){
        PoderDTO poderDTO;
        if (poder==null) {
            return null;
        }
        poderDTO= new PoderDTO();
        poderDTO.setNombre(poder.getNombre());
        poderDTO.setId(poder.getId());
        return poderDTO;
    }
}
