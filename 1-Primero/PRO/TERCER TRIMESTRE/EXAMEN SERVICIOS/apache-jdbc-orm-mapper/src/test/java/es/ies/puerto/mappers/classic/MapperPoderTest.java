package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPoderTest {

    @Test
    public void testPoderToPoderDTO() {
        Poder poder = new Poder("1", "Invisibilidad");

        PoderDTO poderDTO = MapperPoder.poderToPoderDTO(poder);

        Assertions.assertNotNull(poderDTO);
        Assertions.assertEquals("1", poderDTO.getId());
        Assertions.assertEquals("Invisibilidad", poderDTO.getNombre());
    }

    @Test
    public void testPoderToPoderDTONull() {
        PoderDTO poderDTO = MapperPoder.poderToPoderDTO(null);

        Assertions.assertNull(poderDTO);
    }

    @Test
    public void testPoderDTOToPoder() {
        PoderDTO poderDTO = new PoderDTO("1");

        Poder poder = MapperPoder.poderDTOToPoder(poderDTO);

        // Assert
        Assertions.assertNotNull(poder);
        Assertions.assertEquals("1", poder.getId());
    }

    @Test
    public void testPoderDTOToPoderNull() {
        Poder poder = MapperPoder.poderDTOToPoder(null);

        Assertions.assertNull(poder);
    }
}
