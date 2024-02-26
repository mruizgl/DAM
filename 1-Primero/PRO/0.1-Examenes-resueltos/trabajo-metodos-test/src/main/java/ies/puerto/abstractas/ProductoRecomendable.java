package ies.puerto.abstractas;

import ies.puerto.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable{

    
    /**
     * Constructor por defecto
     */
    public ProductoRecomendable(){
    
    }
    /**
     * Constructor con super
     * @param nombre
     * @param precio
     * @param fechaEntrda
     * @param udi
     */
    public ProductoRecomendable(String nombre, float precio, String fechaEntrda,String udi){
        super(nombre, precio, fechaEntrda, udi);
    }
    
    
    
    
    @Override
    public int popularidad() {
       
        return 0;
    }

    @Override
    public boolean recomendar() {
        
        return false;
    }
    

}
