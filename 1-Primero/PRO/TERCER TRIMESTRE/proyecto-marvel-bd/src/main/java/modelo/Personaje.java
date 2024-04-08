package modelo;

import java.util.Objects;
import java.util.Set;

public class Personaje {
    String nombre;
    String alias;
    String genero;
    Set<String> poderes;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre, String alias, String genero, Set<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre) && Objects.equals(alias, personaje.alias) && Objects.equals(genero, personaje.genero) && Objects.equals(poderes, personaje.poderes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, alias, genero, poderes);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
