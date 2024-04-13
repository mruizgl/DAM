package es.ies.puerto;

public class Ejercicio3 {

    public int sumaNumerosTradicional (int numero) {
        int resultado = 0;
        for (int i = numero; i>0; i--) {
            resultado+= numero;
        }
        return resultado;
    }
}
