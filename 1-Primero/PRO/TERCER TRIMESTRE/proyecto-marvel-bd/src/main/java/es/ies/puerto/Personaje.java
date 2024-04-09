package es.ies.puerto;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Personaje {
    private int id;
    private String nombre;
    private String alias;
    private String genero;
    private List<Poder> poderes;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre, String alias, String genero, List<Poder> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
