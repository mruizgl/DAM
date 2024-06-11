package es.ies.puerto.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.mappers.classic.MapperAlias;
import es.ies.puerto.mappers.classic.MappersPersonaje;
import es.ies.puerto.mappers.classic.MappersPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.dto.AliasDTO;
import es.ies.puerto.negocio.dto.EquipamientoDTO;
import es.ies.puerto.negocio.dto.PersonajeDTO;
import es.ies.puerto.negocio.dto.PoderDTO;

public class ClasicTest extends MapperHelp{
    
    PoderDTO poderDTOmapper;
    Poder poderMapper;
    Alias aliasMapper;
    AliasDTO aliasDTOmapper;
    Equipamiento equipamientoMapper;
    EquipamientoDTO equipamientoDTOmapper;
    Personaje personajeMapper;
    PersonajeDTO personajeDTOmapper;

    @Test
    public void poderTopoderDTOTest(){
        poderDTOmapper=MappersPoder.poderTopoderDTO(poder);
        Assertions.assertEquals(poderDTO.getId(), poderDTOmapper.getId());
        Assertions.assertEquals(poderDTO.getNombre(), poderDTOmapper.getNombre());
    
    }
    @Test
    public void poderDTOTopoderTest(){
        poderMapper=MappersPoder.poderDTOTopoder(poderDTO);
        Assertions.assertEquals(poder.getId(), poderMapper.getId());
        Assertions.assertEquals(poder.getNombre(), poderMapper.getNombre());
    
    }
    @Test
    public void AliastoDTOTest(){
        aliasDTOmapper = MapperAlias.aliasToAliasDTO(alias);
        Assertions.assertEquals(aliasDTO.getDescripcion(),aliasDTOmapper.getDescripcion());
        Assertions.assertEquals(aliasDTO.getPersonaje_id(),aliasDTOmapper.getPersonaje_id());
    }
    @Test
    public void AliasDTOtoAliasTest(){
        aliasMapper = MapperAlias.DTOtoAlias(aliasDTO);
        Assertions.assertEquals(alias.getDescripcion(),aliasMapper.getDescripcion());
        Assertions.assertEquals(alias.getPersonaje_id(),aliasMapper.getPersonaje_id());
    }
    @Test
    public void personajeToDtoTest(){
        personajeDTOmapper= MappersPersonaje.personajeToDTO(personaje);
        Assertions.assertEquals(personajeDTO.getId(),personajeDTOmapper.getId());
        Assertions.assertEquals(personajeDTO.getNombre(),personajeDTOmapper.getNombre());
        Assertions.assertEquals(personajeDTO.getAlias(),personajeDTOmapper.getAlias());
        Assertions.assertEquals(personajeDTO.getEquipamientos(),personajeDTOmapper.getEquipamientos());
        Assertions.assertEquals(personajeDTO.getPoderes(),personajeDTOmapper.getPoderes());

    }
    @Test
    public void personajeDTOToPersonajeTest(){
        personajeMapper= MappersPersonaje.DTOtoPersonaje(personajeDTO);
        Assertions.assertEquals(personaje.getId(),personajeMapper.getId());
        Assertions.assertEquals(personaje.getNombre(),personajeMapper.getNombre());
        Assertions.assertEquals(personaje.getAlias(),personajeMapper.getAlias());
        Assertions.assertEquals(personaje.getEquipamientos(),personajeMapper.getEquipamientos());
        Assertions.assertEquals(personaje.getPoderes(),personajeMapper.getPoderes());

    }
}
