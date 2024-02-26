package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.IVendible;

import java.util.Objects;

public abstract class Producto implements IVendible {
    public String nombre;
    public float precio;
    public String fechaEntrada;
    public String udi;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }

    public Producto() {
    }

    public Producto(String nombre, float precio, String fechaEntrada, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrada = fechaEntrada;
        this.udi = udi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(udi, producto.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }

    @Override
    public String toString() {
        return "Producto: " + "nombre= '" + nombre + ", precio= " + precio + ", fechaEntrada='" + fechaEntrada  + ", udi='" + udi;
    }
}
