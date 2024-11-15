package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperEquipamientoTest {
    String MESSAGE_ERROR = "No se obtuvo el resultado esperado";
    @Test
    public void testEquipamientoToEquipamientoDTO() {
        Equipamiento equipamiento = new Equipamiento("1", "Espada", "Una espada larga", "100");
        EquipamientoDTO equipamientoDTO = MapperEquipamiento.equipamientoToEquipamientoDTO(equipamiento);

        Assertions.assertNotNull(equipamientoDTO, MESSAGE_ERROR);
        Assertions.assertEquals("1", equipamientoDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals("Espada", equipamientoDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals("Una espada larga", equipamientoDTO.getDescripcion(), MESSAGE_ERROR);
        Assertions.assertEquals("100", equipamientoDTO.getPersonaje_id(), MESSAGE_ERROR);
    }

    @Test
    public void testEquipamientoToEquipamientoDTONull() {

        EquipamientoDTO equipamientoDTO = MapperEquipamiento.equipamientoToEquipamientoDTO(null);

        Assertions.assertNull(equipamientoDTO);
    }

    @Test
    public void testEquipamientoDTOToEquipamiento() {
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO("1", "Espada", "Una espada larga", "100");

        Equipamiento equipamiento = MapperEquipamiento.equipamientoDTOToEquipamiento(equipamientoDTO);

        Assertions.assertNotNull(equipamiento);
        Assertions.assertEquals("1", equipamiento.getId());
        Assertions.assertEquals("Espada", equipamiento.getNombre());
        Assertions.assertEquals("Una espada larga", equipamiento.getDescripcion());
        Assertions.assertEquals("100", equipamiento.getPersonaje_id());
    }

    @Test
    public void testEquipamientoDTOToEquipamientoNull() {
        Equipamiento equipamiento = MapperEquipamiento.equipamientoDTOToEquipamiento(null);

        Assertions.assertNull(equipamiento, MESSAGE_ERROR);
    }
}
