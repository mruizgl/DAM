package ies.puerto.implementacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import ies.puerto.abstractas.ProductoFresco;

public class Alimento extends ProductoFresco{


    /**
     * Constructor por defecto
     */
    public Alimento(){}
    /**
     * Constructor con super
     * @param nombre
     * @param precio
     * @param fechaEntrda
     * @param udi
     */
    public Alimento(String udi){
        super(udi);
    }
    public Alimento(String nombre, float precio, String fechaEntrda, String udi) {
        super(nombre, precio, fechaEntrda, udi);
        
    }
    @Override
    public float precioMaximo() {
        return getPrecio() * 1.35f;
    }
    @Override
    public boolean estaCadudado() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaEntradaFormat= LocalDate.parse(getFechaEntrda(),formato);
        LocalDate fechaCaducidadFormat = LocalDate.parse(getFechaCaducidad(), formato);
        Period periodo = Period.between(fechaEntradaFormat,fechaCaducidadFormat);
        if (periodo.isNegative()) {
            return true;
        }
        
        return false;
    }
    @Override
    public int caducidad() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaEntradaFormat= LocalDate.parse(getFechaEntrda(),formato);
        LocalDate fechaCaducidadFormat = LocalDate.parse(getFechaCaducidad(), formato);
        return 0;
    }
    
    
    
}
