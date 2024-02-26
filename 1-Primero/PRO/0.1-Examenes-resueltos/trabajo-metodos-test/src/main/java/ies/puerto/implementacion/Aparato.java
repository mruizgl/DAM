package ies.puerto.implementacion;

import ies.puerto.abstractas.Producto;

public class Aparato extends Producto {

    public Aparato(String udi){
        super(udi);
    }
    @Override
    public float precioMaximo() {
        
        return getPrecio()*1.42f;
    }


}
