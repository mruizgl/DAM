package es.ies.puerto.modelo.impl;

import java.util.ArrayList;

public class Heroes {
    private ArrayList<Personaje> personajes;

    public Heroes() {
        personajes = new ArrayList<>();
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    private boolean existeHeroe (Personaje personaje) {
        if (personajes.contains(personaje)) {
            return true;
        }
        return false;
    }

    private int buscarPosicion (Personaje personaje) {
        return personajes.indexOf(personaje);
    }

    public boolean addHeroe (Personaje personaje) {
        if (!existeHeroe(personaje)) {
            personajes.add(personaje);
            return true;
        }else {
            return false;
        }
    }
    public boolean deleteHeroe (Personaje personaje) {
        if (existeHeroe(personaje)) {
            personajes.remove(personaje);
            return true;
        }else {
            return false;
        }
    }

    public boolean updateHeroe (Personaje personaje) {
        if (existeHeroe(personaje)) {
            personajes.set(buscarPosicion(personaje), personaje);
            return true;
        }else {
            return false;
        }
    }

    public void mostrarPersonajes () {
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
    }
}
