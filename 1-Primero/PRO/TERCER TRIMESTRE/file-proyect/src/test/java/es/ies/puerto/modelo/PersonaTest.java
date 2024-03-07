package es.ies.puerto.modelo;

import es.ies.puerto.modelo.file.FileCsv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PersonaTest {
    int id = 1;
    String nombre = "nombre";
    int edad = 12;
    String email = "test@test.com";
    Persona persona;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach() {
        persona = new Persona(id, nombre, edad, email);
        personas = new ArrayList<>();
        personas.add(persona);

    }

    @Test
    public void createPersonaTest() {
        Assertions.assertNotNull(persona, "El objeto no puede ser null");

    }
    @Test
    public void toStringPersonaTest() {
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)), "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(nombre)), "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)), "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(email)), "El resultado no es el esperado");

    }

    @Test
    public void equalsPersonaTest() {
        Persona personaBuscar = new Persona(id);
        Assertions.assertEquals(personaBuscar, persona, "Las personas deben de ser iguales");
    }

    @Test
    public void personaToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(persona, new File("src/main/resources/persona.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Test
    public void xmlToPersonaTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/persona.xml");
            Persona persona = serializer.read(Persona.class, file);
            Assertions.assertEquals(nombre, persona.getNombre(), "No se ha obtenido el resultado esperado");
            Assertions.assertEquals(edad, persona.getEdad(), "No se ha obtenido el resultado esperado");
            Assertions.assertEquals(email, persona.getEmail(), "No se ha obtenido el resultado esperado");
            Assertions.assertEquals(id, persona.getId(), "No se ha obtenido el resultado esperado");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


}
