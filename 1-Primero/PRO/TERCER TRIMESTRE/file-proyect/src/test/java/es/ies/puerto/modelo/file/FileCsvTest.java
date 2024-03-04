package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileCsvTest {
    FileCsv fileCsv;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach() {
        personas = new ArrayList<>();
        fileCsv = new FileCsv();
    }

    @Test
    public void obtenerPersonasTest() {
        personas = fileCsv.obtenerPersonas();
        Assertions.assertFalse(personas.isEmpty(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void addPersona() {
        String nombreInsertar = "nombre";
        int edadInsertar = 99;
        String emailInsertar = "otro@email.com";
        Persona personaInsertar = new Persona(5, nombreInsertar, edadInsertar, emailInsertar);

    }
}
