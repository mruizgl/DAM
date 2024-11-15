package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.mappers.classic.MapperPersonaje;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapperPersonajeTest {
    String MESSAGE_ERROR = "No se obtuvo el resultado esperado";

    @Test
    public void testPersonajeToPersonajeDTO() {
        List<String> poderes = List.of("Volar", "Super fuerza");
        Set<Equipamiento> equipamientos = new HashSet<>();
        equipamientos.add(new Equipamiento("1", "Escudo", "Escudo de vibranium", "100"));
        Set<Alias> alias = new HashSet<>();
        alias.add(new Alias("1", "Capitán América", "100"));

        Personaje personaje = new Personaje("1");
        PersonajeDTO personajeDTO = IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(personaje);

        Assertions.assertNotNull(personajeDTO, MESSAGE_ERROR);
        Assertions.assertEquals("1", personajeDTO.getId(), MESSAGE_ERROR);
    }

    @Test
    public void testPersonajeToPersonajeDTONull() {
        PersonajeDTO personajeDTO = IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(null);

        Assertions.assertNull(personajeDTO);
    }

    @Test
    public void testPersonajeDTOToPersonaje() {
        PersonajeDTO personajeDTO = new PersonajeDTO("1");

        Personaje personaje = IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO);

        Assertions.assertNotNull(personaje);
        Assertions.assertEquals("1", personaje.getId());

    }

    @Test
    public void testPersonajeDTOToPersonajeNull() {
        Personaje personaje = IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(null);

        Assertions.assertNull(personaje);
    }
}
