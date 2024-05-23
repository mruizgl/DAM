package es.ies.puerto;

import java.util.Objects;

public class Poder {
    int personajeId;
    String poder;

    public Poder(int personajeId, String poder) {
        this.personajeId = personajeId;
        this.poder = poder;
    }

    public Poder(String poder) {
        this.poder = poder;
    }

    public int getPersonajeId() {
        return personajeId;
    }

    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder poder1 = (Poder) o;
        return Objects.equals(poder, poder1.poder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poder);
    }

    @Override
    public String toString() {
        return poder;
    }
}
