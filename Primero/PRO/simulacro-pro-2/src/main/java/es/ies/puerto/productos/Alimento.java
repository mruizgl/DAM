package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends Producto {
    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 0.23f;
    }

    public int diasDisponible() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        Date fechaEntrada;

        try {
            fechaEntrada = simpleDateFormat.parse(getFechaEntrada());
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage() + "Error al parsear");
        }

        long diferencia = fechaActual.getTime() - fechaEntrada.getTime();
        int diasDisponibles = (int) (diferencia / (1000 * 60 * 60 * 24));
        return diasDisponibles;
    }

    public boolean caducado() {
        if (diasDisponible() > 30 ) {
            return true;
        }

        return false;
    }

}
