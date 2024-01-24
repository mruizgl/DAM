package ies.puerto;

public class Ejercicio2 {

    public int[] burbuja(int [] array) {
        int tamanio = array.length;
        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < tamanio-1; i++) {
                if ( array[i-1] > array [i]) {
                    int temporal = array [i];
                    array[i] = array [i-1];
                    array[i-1] = temporal;
                    intercambio = true;
                }
            }
        } while (intercambio);

        return ordenado;
    }
}
