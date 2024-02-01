package ies.puerto.impl;

import ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo {

    @Override
    public int velocidadMaxima() {
        return 180;
    }
}
