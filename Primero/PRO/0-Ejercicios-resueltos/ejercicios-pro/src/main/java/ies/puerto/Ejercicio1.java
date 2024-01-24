package ies.puerto;

public class Ejercicio1 {

    /**
     * Funcion que establece un indice de inicio y fin y calcula el punto medio del array. Compara el valor buscado con el punto medio.
     * @param valor
     * @return
     */
    public int busquedaBinaria(int valor) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int puntoMedio = (inicio + fin) / 2;
                    if (array[puntoMedio] == valor){
                        return puntoMedio;
                    }else if (array [puntoMedio] < valor) {
                        inicio = puntoMedio + 1;
                    } else {
                        fin = puntoMedio -1;
                    }
        }
    return -1;
    }
}
