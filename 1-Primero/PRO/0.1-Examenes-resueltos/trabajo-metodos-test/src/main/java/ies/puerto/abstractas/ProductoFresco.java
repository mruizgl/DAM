package ies.puerto.abstractas;

import ies.puerto.interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable{
    
    private String fechaCaducidad;

    public ProductoFresco(String udi){
        super(udi);
    }
    public ProductoFresco() {
    }
    /**
     * Constructor con los valores de su padre
     * @param nombre
     * @param precio
     * @param fechaEntrda
     * @param udi
     */
    public ProductoFresco(String nombre, float precio, String fechaEntrda, String udi) {
        super(nombre, precio, fechaEntrda, udi);
    }
    /**
     * Constructor con todos las propiedades
     * @param nombre
     * @param precio
     * @param fechaEntrda
     * @param udi
     * @param fechaCaducidad
     */
    public ProductoFresco(String nombre, float precio, String fechaEntrda, String udi, String fechaCaducidad) {
        super(nombre, precio, fechaEntrda, udi);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }



    @Override
    public int caducidad() {
        
        return 0;
    }

    @Override
    public boolean estaCadudado() {
        
        return false;
    }

    @Override
    public String toString(){
        return "El producto: "+getNombre()+", con un precio de: "+getPrecio()+"€ tiene una fecha de entrada de:  "+getFechaEntrda()+" y una fecha de caducidad de "+fechaCaducidad;
    }
}
