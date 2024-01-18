package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosFicheros implements ILecturaDatos {
    @Override
    public String lectura() {
        return "Realizada la lectura de datos desde fichero";
    }

    @Override
    public String apertura() {
        return "Abriendo el sistema de ficheros";
    }

    @Override
    public String cierre() {
        return "Cerrando el sistema de ficheros";
    }
}
