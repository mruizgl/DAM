package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;

public class FileXml2 implements ICrudOperaciones {

    public  void deletePersona(Persona persona) {
        if (!personas.contains(persona)) {
            return;
        }
        int posicion = personas.indexOf(persona);
        persona
    }
}
