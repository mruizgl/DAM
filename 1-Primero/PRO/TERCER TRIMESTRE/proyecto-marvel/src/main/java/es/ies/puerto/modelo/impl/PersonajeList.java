package es.ies.puerto.modelo.impl;

import org.simpleframework.xml.Root;

import java.util.ArrayList;

public class PersonajeList {
    @Root
    private ArrayList<Personaje> personajes;

    public PersonajeList() {
    }

    public PersonajeList(ArrayList<Personaje> personajes) {
        this.personajes = new ArrayList<>();
    }
}
