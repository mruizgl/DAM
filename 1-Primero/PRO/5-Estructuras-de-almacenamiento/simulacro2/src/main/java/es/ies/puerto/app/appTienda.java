package es.ies.puerto.app;

import es.ies.puerto.abstractas.Producto;
import es.ies.puerto.productos.Alimento;
import es.ies.puerto.productos.Electronica;
import es.ies.puerto.productos.Soubenir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class appTienda {
    static HashSet<Alimento> listaAlimento2;
    static List<Electronica> listaElectronica2;
    static HashMap<Producto, Soubenir> listaSoubenir2;
    public static void main(String[] args) {
        listaAlimento2 = new HashSet<>();
        listaElectronica2 = new ArrayList<>();
        listaSoubenir2 = new HashMap<>();

    }
}
