package es.ies.puerto.dto;

import java.util.Objects;

public class PoderDTO {
    String id;
    String nombre;

    public PoderDTO() {
    }

    public PoderDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PoderDTO{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoderDTO poderDTO = (PoderDTO) o;
        return Objects.equals(id, poderDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
