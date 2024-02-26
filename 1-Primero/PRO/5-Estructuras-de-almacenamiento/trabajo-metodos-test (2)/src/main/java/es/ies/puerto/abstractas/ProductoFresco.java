package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable {
    public String fechaCaducidad;

    public ProductoFresco(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public ProductoFresco(String nombre, float precio, String fechaEntrada, String udi, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, udi);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public int calcularCaducidad() {
        return 0;
    }

    @Override
    public boolean caducado() {
        return false;
    }

    @Override
    public float calcularPrecioMaximo() {
        return 0;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", udi='" + udi + '\'' +
                '}';
    }
}
