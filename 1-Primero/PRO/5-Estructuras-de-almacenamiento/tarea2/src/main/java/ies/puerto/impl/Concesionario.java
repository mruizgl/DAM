package ies.puerto.impl;

import java.util.ArrayList;
import java.util.HashSet;

public class Concesionario {
    private HashSet<Coche> coches;
    private ArrayList<Motocicleta> motocicletas;

    boolean addCoche (Coche coche) {
        if (!obtenerCoche((coche.getMatricula()))) {
            coches.add(coche);
        }
        return true;
    }

    boolean removeCoche (Coche coche) {
        if (obtenerCoche((coche.getMatricula()))) {
            coches.remove(coche);
        }
        return true;
    }

    boolean obtenerCoche (String matricula) {
        if (coches == null || coches.isEmpty()) {
            return false;
        }
        if (coches.contains(matricula)) {           ///CON ESTO EVITAMOS DUPLICADOS
            return false;
        }
        return true;
    }

    boolean addMotocicleta(Motocicleta motocicleta) {
        if (!obtenerMotocicleta(motocicleta.getMatricula())) {
            motocicletas.add(motocicleta);
        }
        return true;
    }

    boolean removeMotocicleta(Motocicleta motocicleta) {
        if (obtenerMotocicleta(motocicleta.getMatricula())) {
            motocicletas.remove(motocicleta);
        }
        return true;
    }
    boolean obtenerMotocicleta(String matricula) {
        if (motocicletas == null || motocicletas.isEmpty()) {
            return false;
        }
        if (motocicletas.contains(matricula)) {
            return false;
        }
        return true;
    }

    public float velocidadMediaCoches() {

        return 0;
    }

    public float velocidadMediaVehiculos() {

        return 0;
    }
}
