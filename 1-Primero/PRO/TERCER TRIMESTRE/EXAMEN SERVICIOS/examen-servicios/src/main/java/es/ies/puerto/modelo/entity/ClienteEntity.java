package es.ies.puerto.modelo.entity;

import java.util.Objects;

public class ClienteEntity {
    private int id;
    private String nombre;
    private String email;
    
    public ClienteEntity() {
    }

    public ClienteEntity(int id) {
        this.id = id;
    }

    public ClienteEntity(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClienteEntity other = (ClienteEntity) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ClienteEntity [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
    }
    

}
