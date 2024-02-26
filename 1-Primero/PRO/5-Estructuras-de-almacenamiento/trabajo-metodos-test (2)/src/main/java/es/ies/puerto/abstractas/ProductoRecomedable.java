package es.ies.puerto.abstractas;

import es.ies.puerto.interfaces.IRecomendable;

public abstract class ProductoRecomedable extends Producto implements IRecomendable {
    public ProductoRecomedable() {
    }

    public ProductoRecomedable(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }



    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public boolean recomendarProducto() {
        return false;
    }

    @Override
    public int calcularPopularidad() {
        return 7;
    }
}
