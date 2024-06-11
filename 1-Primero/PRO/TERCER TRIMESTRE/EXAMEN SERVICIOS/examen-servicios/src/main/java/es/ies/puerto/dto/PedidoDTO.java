package es.ies.puerto.dto;

import java.io.Serializable;

public class PedidoDTO implements Serializable{
    private int id;
    private String producto;
    private int cantidad;
    
    public PedidoDTO() {
    }
    public PedidoDTO(int id) {
        this.id = id;
    }
    public PedidoDTO(int id, String producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
        PedidoDTO other = (PedidoDTO) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "PedidoDTO [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + "]";
    }
    
}
