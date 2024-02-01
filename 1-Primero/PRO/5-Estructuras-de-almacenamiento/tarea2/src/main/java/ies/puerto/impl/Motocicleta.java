package ies.puerto.impl;

import ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo {

    @Override
    public int velocidadMaxima() {
        return 120;
    }
}
