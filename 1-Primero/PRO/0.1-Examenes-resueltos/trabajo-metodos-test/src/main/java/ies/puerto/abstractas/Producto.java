package ies.puerto.abstractas;

import ies.puerto.interfaces.IVendible;

public  abstract class Producto implements IVendible{
    
    private String nombre;
    private float precio;
    private String fechaEntrda;
    private String udi;
    
    
    
    
    
    
    
    /**
     * Constructor por defecto
     */
    public Producto() {
    }
    /**
     * Constructor con el identificador 
     * @param udi
     */
    public Producto(String udi) {
        this.udi = udi;
    }
    /**
     * Constructor con 2 propiedades
     * @param nombre
     * @param udi
     */
    public Producto(String nombre, String udi) {
        this.nombre = nombre;
        this.udi = udi;
    }
    /**
     * Constructor con todos las propiedades
     * @param nombre
     * @param precio
     * @param fechaEntrda
     * @param udi
     */
    public Producto(String nombre, float precio, String fechaEntrda, String udi) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaEntrda = fechaEntrda;
        this.udi = udi;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getFechaEntrda() {
        return fechaEntrda;
    }
    public void setFechaEntrda(String fechaEntrda) {
        this.fechaEntrda = fechaEntrda;
    }
    public String getUdi() {
        return udi;
    }
    public void setUdi(String udi) {
        this.udi = udi;
    }
    
    @Override
    public int cantidadDisponible() {
        
        return 0;
    }
    @Override
    public float precioMaximo() {
        
        return 0;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((udi == null) ? 0 : udi.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (udi == null) {
            if (other.udi != null)
                return false;
        } else if (!udi.equals(other.udi))
            return false;
        return true;
    }
    @Override
    public String toString(){
        return "El producto: "+nombre+", con un precio de: "+precio+"€ tiene una fecha de entrada de:  "+fechaEntrda;
    }
    public String cantidadProductos(){
        return "Del producto "+nombre+", hay una cantida  total de "+cantidadDisponible();
    }
}
