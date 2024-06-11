package es.ies.puerto.mappers.classic;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.negocio.dto.AliasDTO;

public class MapperAlias {
    
    public static Alias DTOtoAlias(AliasDTO aliasDTO){
        if (aliasDTO==null) {
            return null;
        }
        Alias alias= new Alias();
        alias.setId(aliasDTO.getId());
        alias.setPersonaje_id(aliasDTO.getPersonaje_id());
        alias.setDescripcion(aliasDTO.getDescripcion());
        return alias;
    }
    public static AliasDTO aliasToAliasDTO(Alias alias){
        if (alias==null) {
            return null;
        }
        AliasDTO aliasDTO= new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setPersonaje_id(alias.getPersonaje_id());
        aliasDTO.setDescripcion(alias.getDescripcion());
        return aliasDTO;
    }
}
