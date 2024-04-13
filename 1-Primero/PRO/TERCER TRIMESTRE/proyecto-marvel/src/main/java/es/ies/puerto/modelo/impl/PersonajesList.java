package es.ies.puerto.modelo.impl;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

public class PersonajesList {
    @Root(name = "personajes")
    public class PersonajeList {
        @ElementList(inline = true)
        private ArrayList<Personaje> personajes;

        public PersonajeList() {
            personajes = new ArrayList<>();
        }

        public PersonajeList(ArrayList<Personaje> personajes) {
            this.personajes = personajes;
        }


    }
}
