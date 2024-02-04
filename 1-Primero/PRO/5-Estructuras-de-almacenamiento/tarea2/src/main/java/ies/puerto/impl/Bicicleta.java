package ies.puerto.impl;

import ies.puerto.abstractas.Vehiculo;

public class Bicicleta extends Vehiculo {
    @Override
    public int velocidadMaxima() {
        return 40;
    }

    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
}
