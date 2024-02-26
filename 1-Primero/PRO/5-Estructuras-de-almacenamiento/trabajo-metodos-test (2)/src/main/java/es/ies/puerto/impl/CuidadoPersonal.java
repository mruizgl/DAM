package es.ies.puerto.impl;

import es.ies.puerto.abstractas.ProductoRecomedable;

public class CuidadoPersonal extends ProductoRecomedable {

    public CuidadoPersonal() {
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
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
    public boolean recomendarProducto() {
        return super.recomendarProducto();
    }

    @Override
    public int calcularPopularidad() {
        return 7;
    }
}
