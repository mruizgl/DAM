package ies.puerto.app;

import ies.puerto.abstrac.ConductorAbstrac;
import ies.puerto.impl.Automovil;
import ies.puerto.interfaz.IConductor;

public class AppConduccion {
    static Automovil automovil;

    public static void main(String[] args) {
        automovil = new Automovil();
        System.out.println(automovil.detener());
        System.out.println(automovil.arrancar());
        System.out.println(automovil.conducir());
    }
}
