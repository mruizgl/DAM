package es.ies.puerto.impl;

import es.ies.puerto.abstractas.Producto;

public class Souvenir extends Producto {
    @Override
    public float calcularPrecioMaximo() {
        return 1.3f*getPrecio();
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
