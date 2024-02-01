package ies.puerto.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {
    static HashMap<String, Persona> personaHashMap;
    static List<Persona> personaList;
    public static void main(String[] args) {
        personaHashMap = new HashMap<>();
        personaList = new ArrayList<>();

        Persona persona1 = new Persona("Carlos", "1000000D");
        addPersonaLista(persona1);
        addPersonaHashMap(persona1);
    }

     public static boolean addPersonaLista(Persona persona) {
        if (!existePersonaLista((persona))) {
            personaList.add(persona);
        }
        return true;
    }

    public static boolean existePersonaLista(Persona persona) {
        if (personaList == null || personaList.isEmpty()) {
            return false;
        }
        if (personaList.contains(persona)) {
            return false;
        }
        return true;
    }

    public static boolean addPersonaHashMap (Persona persona) {
        if(!existePersonaHashMap(persona)) {
            personaHashMap.put(persona.getDni(), persona);
        }
        return true;
    }

    public static boolean existePersonaHashMap(Persona persona) {
        if (personaHashMap == null || personaHashMap.isEmpty()) {
            return false;
        }
        if (personaHashMap.containsKey(persona.getDni())) {
            return false;
        }
        return true;
    }
}
