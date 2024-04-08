package modelo;

import java.util.Objects;

public class Poder {
    int personaje_id;
    String poder;

    public Poder(int personaje_id, String poder) {
        this.personaje_id = personaje_id;
        this.poder = poder;
    }

    public Poder(String poder) {
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
        return "Poder{" +
                "personaje_id=" + personaje_id +
                ", poder='" + poder + '\'' +
                '}';
    }
}
