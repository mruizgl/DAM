package es.ies.puerto.app;

import es.ies.puerto.abstractas.Producto;
import es.ies.puerto.productos.Alimento;
import es.ies.puerto.productos.Electronica;
import es.ies.puerto.productos.Souvenir;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.*;

public class AppSupermercado {
    static HashSet<Alimento> alimentoHashSet;
    static List<Electronica> electronicaList;
    static Map<String, Souvenir> souvenirHashMap;


    public static void main(String[] args) {
        alimentoHashSet = new HashSet<>();
        electronicaList = new ArrayList<>();
        souvenirHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
    }



    public static boolean addAlimentoLista (Alimento alimento) {
        if (!existeAlimentoLista(alimento)) {
            alimentoHashSet.add(alimento);
        }
        return true;
    }

    public static boolean removeAlimentoLista (Alimento alimento) {
        if (!existeAlimentoLista(alimento)) {
            alimentoHashSet.remove(alimento);
        }
        return true;
    }

    public static boolean existeAlimentoLista(Alimento alimento) {
        if (alimentoHashSet == null || alimentoHashSet.isEmpty()) {
            return false;
        }
        if (alimentoHashSet.contains(alimento)) {
            return false;
        }
        return true;
    }



    public static boolean addSouvenirHashMap (Souvenir souvenir) {
        if(existeSouvenirHashMap(souvenir)) {
            souvenirHashMap.put(souvenir.getUdi(), souvenir);
        }
        return true;
    }

    public static boolean removeSouvenirHashMap (Souvenir souvenir) {
        if(existeSouvenirHashMap(souvenir)) {
            souvenirHashMap.remove(souvenir.getUdi(), souvenir);
        }
        return true;
    }

    public static Souvenir obtenerSouvenir (String udi) {
        return souvenirHashMap.get(udi);
    }

    public static boolean existeSouvenirHashMap (Souvenir souvenir) {
        if (souvenirHashMap == null || souvenirHashMap.isEmpty()) {
            return false;
        }
        if (souvenirHashMap.containsKey(souvenir.getUdi())) {
            return false;
        }

        return true;
    }

    public static boolean addElectronicaList (Electronica electronica) {
        if (!existeElectronicaLista(electronica)) {
            electronicaList.add(electronica);
        }
        return true;
    }

    public static boolean removeElectronicaList (Electronica electronica) {
        if (!existeElectronicaLista(electronica)) {
            electronicaList.remove(electronica);
        }
        return true;
    }

    public static boolean existeElectronicaLista (Electronica electronica) {

        if (electronica == null) {
            return false;
        }

        return true;
    }

    public HashSet<Alimento> obtenerAlimentosCaducados(HashSet<Alimento> alimentos) {
        HashSet<Alimento> caducados = new HashSet<>();
        for (Alimento alimento : alimentos) {
            if (alimento.caducado()) {
                caducados.add(alimento);
            }
        }
        return caducados;
    }

    public float precioAlimentos(HashSet<Alimento> alimentos) {
        float total = 0;
        for (Alimento alimento : alimentos) {
            total += alimento.precioMaximo();
        }
        return total;
    }

    public float precioElectronica(ArrayList<Electronica> electronicas) {
        float total = 0;
        for (Electronica electronico : electronicas) {
            total += electronico.precioMaximo();
        }
        return total;
    }






}
