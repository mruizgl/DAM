package ies.puerto.impl;

import ies.puerto.interfaz.IConexionRed;

public class ConexionWifi implements IConexionRed {
    @Override
    public String conectar() {
        return "Conectando vía Wifi...";
    }
}
