package ies.puerto.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {
    @Override
    public String arrancar() {
        return "Automovil arrancado";
    }

    @Override
    public String detener() {
        return "Automovil detenido";
    }

    public String conducir() {
        return "Automovil en conduccion";
    }
}
