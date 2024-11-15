package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAliasTest {
    String MESSAGE_ERROR = "No se obtuvo el resultado esperado";

    @Test
    public void testAliasToAliasDTO() {
        Alias alias = new Alias();
        alias.setId("6");
        alias.setDescripcion("Descripcion");
        alias.setPersonaje_id("7");

        AliasDTO aliasDTO = MapperAlias.aliasToAliasDTO(alias);

        Assertions.assertNotNull(aliasDTO, MESSAGE_ERROR);
        Assertions.assertEquals(alias.getId(), aliasDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(alias.getDescripcion(), aliasDTO.getDescripcion(), MESSAGE_ERROR);
        Assertions.assertEquals(alias.getPersonaje_id(), aliasDTO.getPersonaje_id(), MESSAGE_ERROR);
    }

    @Test
    public void testAliasToAliasDTONull() {
        AliasDTO aliasDTO = MapperAlias.aliasToAliasDTO(null);
        Assertions.assertNull(aliasDTO, MESSAGE_ERROR);
    }

    @Test
    public void testAliasDTOToAlias() {
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId("6");
        aliasDTO.setDescripcion("Descripcion");
        aliasDTO.setPersonaje_id("7");

        Alias alias = MapperAlias.aliasDTOToAlias(aliasDTO);

        Assertions.assertNotNull(alias);
        Assertions.assertEquals(aliasDTO.getId(), alias.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(aliasDTO.getDescripcion(), alias.getDescripcion(), MESSAGE_ERROR);
        Assertions.assertEquals(aliasDTO.getPersonaje_id(), alias.getPersonaje_id(), MESSAGE_ERROR);
    }

    @Test
    public void testAliasDTOToAliasNull() {
        Alias alias = MapperAlias.aliasDTOToAlias(null);
        Assertions.assertNull(alias, MESSAGE_ERROR);
    }


}
