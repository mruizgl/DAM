package ies.puerto.impl;

import ies.puerto.abstrac.LecturaDatosAbstract;
import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract {
    @Override
    public String lectura() {
        return "Leyendo datos desde la BBDD";
    }

    @Override
    public String apertura() {
        return "Apertura de la BBDD";
    }

    @Override
    public String cierre() {
        return "Cierre de la BBDD";
    }
}
