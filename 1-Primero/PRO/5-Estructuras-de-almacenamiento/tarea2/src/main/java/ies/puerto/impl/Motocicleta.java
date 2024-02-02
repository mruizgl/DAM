package ies.puerto.impl;

import ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo {

    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    @Override
    public int velocidadMaxima() {
        return 120;
    }
}
