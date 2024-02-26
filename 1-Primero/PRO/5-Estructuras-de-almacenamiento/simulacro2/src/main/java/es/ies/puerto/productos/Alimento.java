package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

public class Alimento extends Producto {
    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre,precio,fechaEntrada,udi);
    }
    @Override
    public float precioMaximo() {
        return 0.23f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
    public int diasDisponible(){
        return 0;
    }
    public boolean caducado(){
        return false;
    }
}
