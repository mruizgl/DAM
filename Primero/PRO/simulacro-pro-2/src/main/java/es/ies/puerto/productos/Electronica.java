package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

public class Electronica extends Producto {

    public Electronica(String nombre, String precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()* 0.6f;
    }
}
