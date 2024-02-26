package es.ies.puerto.productos;

import es.ies.puerto.abstractas.Producto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Supermercado {

    static HashSet<Alimento> listaAlimento;
    static List<Electronica> listaElectronica;
    static HashMap<Producto, Soubenir> listaSoubenir;

    public static boolean addAlimento(Alimento alimento){
        if (listaAlimento.isEmpty()) {
            return false;
        }
        return true;
    }
    public static void removeAlimento(Alimento alimento){

    }

    public static void obtenerAlimento(Alimento alimento){

    }
    public static void obtenerAlimentoCaducados(Alimento alimento){

    }
    public static boolean addElectronica(Electronica electronica){
        if (listaElectronica.isEmpty()){
            return false;
        }
        return true;
    }
    public static void removeElectronica(Electronica electronica){

    }

    public static void obtenerElectronica(Electronica electronica){

    }

    public static boolean addSoubenir(Soubenir soubenir){
        if (listaSoubenir.isEmpty()){
            return false;
        }
        return true;
    }
    public static void removeSoubenir(Soubenir soubenir){

    }

    public static void obtenerSoubenir(Soubenir soubenir){

    }
}
