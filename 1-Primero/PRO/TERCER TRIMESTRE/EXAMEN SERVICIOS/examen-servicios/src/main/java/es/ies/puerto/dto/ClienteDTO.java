package es.ies.puerto.dto;

import java.io.Serializable;

public class ClienteDTO  implements Serializable{
    private int id;
    private String nombre;
    private String email;
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
    public ClienteDTO(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    public ClienteDTO(int id) {
        this.id = id;
    }
    public ClienteDTO() {
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
        ClienteDTO other = (ClienteDTO) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ClienteDTO [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
    }
    
}
