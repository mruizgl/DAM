package ies.puerto.implementacion;

import ies.puerto.abstractas.ProductoRecomendable;

public class CuidadoPersonal  extends ProductoRecomendable{

    public CuidadoPersonal(){

    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrda, String udi) {
        super(nombre, precio, fechaEntrda, udi);
        
    }

    @Override
    public int popularidad() {
        
        return super.popularidad();
    }

    @Override
    public boolean recomendar() {
        
        return super.recomendar();
    }

    @Override
    public float precioMaximo() {
        
        return getPrecio() * 1.8f;
    }
    
    
}
