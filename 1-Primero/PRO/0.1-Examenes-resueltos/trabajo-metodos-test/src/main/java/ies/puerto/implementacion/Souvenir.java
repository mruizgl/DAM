package ies.puerto.implementacion;

import ies.puerto.abstractas.Producto;

public class Souvenir extends Producto{

    public Souvenir(String udi){
        super(udi);
    }
    
    
    @Override
    public float precioMaximo() {

        return getPrecio()* 1.3f;
    }
    
    
}
