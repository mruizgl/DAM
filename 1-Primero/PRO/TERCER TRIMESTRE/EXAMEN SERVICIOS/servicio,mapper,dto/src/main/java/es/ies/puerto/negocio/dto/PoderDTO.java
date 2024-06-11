package es.ies.puerto.negocio.dto;

public class PoderDTO {
    String id;
    String nombre;

    public PoderDTO() {
    }

    public PoderDTO(String id) {
        this.id = id;
    }

    public PoderDTO(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
        return "Poder [id=" + id + ", nombre=" + nombre + "]";
    }
}
