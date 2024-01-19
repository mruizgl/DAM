package ies.puerto.impl;

import ies.puerto.interfaz.IConexionRed;

public class ConexionEthernet implements IConexionRed {
    @Override
    public String conectar() {
        return "Conectando vía Ethernet...";
    }
}
