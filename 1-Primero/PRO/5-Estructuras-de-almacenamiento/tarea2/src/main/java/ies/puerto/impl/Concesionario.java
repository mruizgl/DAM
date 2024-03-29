package ies.puerto.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Concesionario {
    private HashSet<Coche> coches;
    private ArrayList<Motocicleta> motocicletas;
    private Map<String, Camion> camiones = new HashMap<>();
    private Map<String, Bicicleta> bicicletas = new HashMap<>();

    public boolean addCoche(Coche coche) {
        if (!existeCoche((coche.getMatricula()))) {
            coches.add(coche);
        }
        return true;
    }

    public boolean removeCoche(Coche coche) {
        if (existeCoche((coche.getMatricula()))) {
            coches.remove(coche);
        }
        return true;
    }

    public boolean existeCoche(String matricula) {
        if (coches == null || coches.isEmpty()) {
            return false;
        }
        if (coches.contains(matricula)) {           ///CON ESTO EVITAMOS DUPLICADOS
            return true;
        }
        return true;
    }

    public Coche obtenerCoche(String matricula) {
        for (Coche coche : coches) {
            if (coche.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    public boolean addMotocicleta(Motocicleta motocicleta) {
        if (!existeMotocicleta(motocicleta.getMatricula())) {
            motocicletas.add(motocicleta);
        }
        return true;
    }

    public boolean removeMotocicleta(Motocicleta motocicleta) {
        if (existeMotocicleta(motocicleta.getMatricula())) {
            motocicletas.remove(motocicleta);
        }
        return true;
    }

    public boolean existeMotocicleta(String matricula) {
        if (motocicletas == null || motocicletas.isEmpty()) {
            return false;
        }
        if (motocicletas.contains(matricula)) {
            return false;
        }
        return true;
    }

    public Motocicleta obtenerMotocicleta(String matricula) {
        for (Motocicleta motocicleta : motocicletas) {
            if (motocicleta.equals(matricula)) {
                return motocicleta;
            }
        }
        return null;
    }

    public float velocidadMediaMotocicletas() {
        float sumaVelocidades = 0;
        for (Motocicleta motocicleta : motocicletas) {
            sumaVelocidades += motocicleta.velocidadMaxima();
        }
        return sumaVelocidades / motocicletas.size();
    }

    public float velocidadMediaCoches() {
        float sumaVelocidades = 0;
        for (Coche coche : coches) {
            sumaVelocidades += coche.velocidadMaxima();
        }
        return sumaVelocidades / coches.size();
    }

    public float velocidadMediaVehiculos() {
        float sumaVelocidades = 0;
        float velocidadMediaCoches = velocidadMediaCoches();
        float velocidadMediaMotos = velocidadMediaMotocicletas();

        return (velocidadMediaMotos + velocidadMediaMotos) / (coches.size() + motocicletas.size());
    }

    public boolean addCamion(Camion camion) {
        if (!camiones.containsKey(camion.getMatricula())) {
            camiones.put(camion.getMatricula(), camion);
            return true;
        }
        return false;
    }

    public boolean removeCamion(Camion camion) {
        if (camiones.containsKey(camion.getMatricula())) {
            camiones.remove(camion.getMatricula());
            return true;
        }
        return false;
    }

    public Camion obtenerCamion(String matricula) {
        return camiones.get(matricula);
    }

    public float velocidadMediaCamiones() {
        if (camiones.isEmpty()) {
            return 0;
        }
        float sumaVelocidades = 0;
        for (Camion camion : camiones.values()) {
            sumaVelocidades += camion.getVelocidad();
        }

        return sumaVelocidades / camiones.size();
    }

    public boolean addBicicleta(Bicicleta bicicleta) {
        if (!bicicletas.containsKey(bicicleta.getMatricula())) {
            bicicletas.put(bicicleta.getMatricula(), bicicleta);
            return true;
        }
        return false;
    }

    public boolean removeBicicleta(Bicicleta bicicleta) {
        if (bicicletas.containsKey(bicicleta.getMatricula())) {
            bicicletas.remove(bicicleta.getMatricula());
            return true;
        }
        return false;
    }

    public Bicicleta obtenerBicicleta(String matricula) {
        return bicicletas.get(matricula);
    }

    public float velocidadMediaBicicletas() {
        if (bicicletas.isEmpty()) {
            return 0;
        }

        float sumaVelocidades = 0;
        for (Bicicleta bicicleta : bicicletas.values()) {
            sumaVelocidades += bicicleta.getVelocidad();
        }

        return sumaVelocidades / bicicletas.size();
    }


}
