package es.ies.puerto.impl;

import es.ies.puerto.abstractas.ProductoFresco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Alimento extends ProductoFresco {
    public Alimento(String fechaCaducidad) {
        super(fechaCaducidad);
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String udi, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, udi, fechaCaducidad);
    }

    @Override
    public float calcularPrecioMaximo() {
        return 1.35f * getPrecio();
    }


    @Override
    public int calcularCaducidad() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date hoy = new Date();

        try {
            Date fechaCaducidadDate = simpleDateFormat.parse(fechaCaducidad);
            int diferenciaDias = (int) ((hoy.getTime() - fechaCaducidadDate.getTime()) / 1000 / 60 / 60 / 24);
            return diferenciaDias;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean caducado() {
        if (calcularCaducidad() < 30) {
            return false;
        }
        return true;
    }
}
