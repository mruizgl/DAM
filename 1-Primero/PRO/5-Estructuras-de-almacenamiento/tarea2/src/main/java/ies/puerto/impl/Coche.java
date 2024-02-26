package ies.puerto.impl;

import ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return 180;
    }
}
