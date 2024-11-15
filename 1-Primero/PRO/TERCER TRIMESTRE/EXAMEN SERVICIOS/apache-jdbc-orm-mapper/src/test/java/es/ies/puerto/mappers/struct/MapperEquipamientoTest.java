package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.EquipamientoService;
import es.ies.puerto.services.PoderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MapperEquipamientoTest {
    String MESSAGE_ERROR = "No se obtuvo el resultado esperado";
    @Test
    public void testEquipamientoToEquipamientoDTO() {
        Equipamiento equipamiento = new Equipamiento("1", "Espada", "Una espada larga", "100");
        EquipamientoDTO equipamientoDTO = IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(equipamiento);

        Assertions.assertNotNull(equipamientoDTO, MESSAGE_ERROR);
        Assertions.assertEquals("1", equipamientoDTO.getId(), MESSAGE_ERROR);
        Assertions.assertEquals("Espada", equipamientoDTO.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals("Una espada larga", equipamientoDTO.getDescripcion(), MESSAGE_ERROR);
        Assertions.assertEquals("100", equipamientoDTO.getPersonaje_id(), MESSAGE_ERROR);
    }

    @Test
    public void testEquipamientoToEquipamientoDTONull() {

        EquipamientoDTO equipamientoDTO = IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(null);

        Assertions.assertNull(equipamientoDTO);
    }

    @Test
    public void testEquipamientoDTOToEquipamiento() {
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO("1", "Espada", "Una espada larga", "100");

        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO);

        Assertions.assertNotNull(equipamiento);
        Assertions.assertEquals("1", equipamiento.getId());
        Assertions.assertEquals("Espada", equipamiento.getNombre());
        Assertions.assertEquals("Una espada larga", equipamiento.getDescripcion());
        Assertions.assertEquals("100", equipamiento.getPersonaje_id());
    }

    @Test
    public void testEquipamientoDTOToEquipamientoNull() {
        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(null);

        Assertions.assertNull(equipamiento, MESSAGE_ERROR);
    }



}
