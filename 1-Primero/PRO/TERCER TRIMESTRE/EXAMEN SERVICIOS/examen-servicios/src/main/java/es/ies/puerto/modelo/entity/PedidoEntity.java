package es.ies.puerto.modelo.entity;

import java.util.Objects;

public class PedidoEntity {
    private int id;
    private int clienteId;
    private String producto;
    private int cantidad;
    
    public PedidoEntity() {
    }

    public PedidoEntity(int id) {
        this.id = id;
    }

    public PedidoEntity(int id, int clienteId) {
        this.id = id;
        this.clienteId = clienteId;
    }

    public PedidoEntity(int id, int clienteId, String producto, int cantidad) {
        this.id = id;
        this.clienteId = clienteId;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
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
        PedidoEntity other = (PedidoEntity) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PedidoEntity [id=" + id + ", clienteId=" + clienteId + ", producto=" + producto + ", cantidad="
                + cantidad + "]";
    }

    
}
