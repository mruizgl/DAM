package es.ies.puerto.negocio.dto;

public class AliasDTO {
    String id;
    String descripcion;
    String personaje_id;

    public AliasDTO() {}

    public AliasDTO(String id) {
        this.id = id;
    }

    public AliasDTO(String id, String descripcion, String personaje_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(String personaje_id) {
        this.personaje_id = personaje_id;
    }


    @Override
    public String toString() {
        return "Alias [id=" + id + ", descripcion=" + descripcion + ", personaje_id=" + personaje_id + "]";
    }
}
