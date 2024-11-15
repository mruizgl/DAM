package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
        PersonajeDTO personajeDTO = MapperPersonaje.personajeToPersonajeDTO(personaje);

        Assertions.assertNotNull(personajeDTO, MESSAGE_ERROR);
        Assertions.assertEquals("1", personajeDTO.getId(), MESSAGE_ERROR);
    }

    @Test
    public void testPersonajeToPersonajeDTONull() {
        PersonajeDTO personajeDTO = MapperPersonaje.personajeToPersonajeDTO(null);

        Assertions.assertNull(personajeDTO);
    }

    @Test
    public void testPersonajeDTOToPersonaje() {
        List<String> poderes = List.of("Volar", "Super fuerza");
        Set<EquipamientoDTO> equipamientosDTO = new HashSet<>();
        equipamientosDTO.add(new EquipamientoDTO("1", "Escudo", "Escudo de vibranium", "100"));
        Set<AliasDTO> aliasDTO = new HashSet<>();
        aliasDTO.add(new AliasDTO("1", "Capitán América", "100"));

        PersonajeDTO personajeDTO = new PersonajeDTO("1");


        Personaje personaje = MapperPersonaje.personajeDTOToPersonaje(personajeDTO);

        Assertions.assertNotNull(personaje);
        Assertions.assertEquals("1", personaje.getId());

    }

    @Test
    public void testPersonajeDTOToPersonajeNull() {
        Personaje personaje = MapperPersonaje.personajeDTOToPersonaje(null);

        Assertions.assertNull(personaje);
    }
}
