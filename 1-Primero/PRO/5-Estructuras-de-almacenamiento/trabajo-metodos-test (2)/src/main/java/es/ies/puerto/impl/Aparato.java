package es.ies.puerto.impl;

import es.ies.puerto.abstractas.Producto;

public class Aparato extends Producto {

    public Aparato() {
    }

    public Aparato(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float calcularPrecioMaximo() {
        return 1.3f*getPrecio();
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }


}
