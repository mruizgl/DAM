package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;

import java.util.List;

public class FileJson2Test {
    List<Persona> personas;
    String path = "src/main/resources/data.json";

    public Json2() {
        return personas;
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return personas;
    }

    @Override
    public void obtenerPersona(Persona persona) {
        if (personas.contains(persona)) {
            return;
        }
        personas.add(persona);
    }
}
