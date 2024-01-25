package ies.puerto.ejercicios.uno;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static List<Integer> listaEnteros;
    static List<Integer> listaNumerosImpares;

    public static void main(String[] args) {
        listaEnteros = new ArrayList<>();

        for (int i =1; i<=10;i++){
            if (esPar(i)) {
                listaEnteros.add(i);
            }else {
                listaNumerosImpares.add(i);
            }
        }
        System.out.println("Lista números pares" +listaEnteros);
        System.out.println("Tamanio "+listaEnteros.size());
        System.out.println("Lista números impares "+listaNumerosImpares);
        System.out.println("Tamanio "+ listaNumerosImpares.size() );
    }

    public static boolean esPar (int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

}
