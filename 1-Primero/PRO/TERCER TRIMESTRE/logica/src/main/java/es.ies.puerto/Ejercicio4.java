package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public List<Integer> paresTradicional (int numero) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i <= numero; i+=2) {
            resultado.add(i);
        }
        return resultado;
    }

    public List<Integer> paresRecursivo (int numero) {
        List<Integer> resultado = new ArrayList<>();
        if (numero == 0) {
            resultado.add(numero);
            return resultado;
        }
        if (numero%2 == 0) {
            resultado.add(numero);
            resultado.addAll(paresRecursivo(numero -2));
        }

        resultado.addAll(paresRecursivo(numero -1));
        return resultado;
    }


}
