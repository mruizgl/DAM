package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

public class Souvenir extends Producto {
    @Override
    public float precioMaximo() {
        return getPrecio()*0.4f;
    }
}
