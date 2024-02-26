package ies.puerto.presentacion;

import java.util.Objects;

public abstract class Articulo {
    private String id;
    private String nombre;
    private float precio;
    private String fCaducidad;
    private String fEntrada;

    public Articulo(String id, String nombre, float precio, String fCaducidad, String fEntrada) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fCaducidad = fCaducidad;
        this.fEntrada = fEntrada;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fCaducidad='" + fCaducidad + '\'' +
                ", fEntrada='" + fEntrada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
