package ies.puerto;

public class Ejercicio9 {

    /**
     * Método main que combina los dos arrays y mostramos el resultado en consola.
     * @param args Muestra resultado
     */
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] resultado = combinarArraysOrdenados(array1, array2);

        System.out.println("Array combinado ordenado: ");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }

    /**
     * Función que combina arrays.
     * @param array1 Array ordenado 1
     * @param array2 Array ordenado 2
     * @return Devuelve resultado, que es un tercer array combinando los elementos de array y array2 en orden
     */
    public static int[] combinarArraysOrdenados(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] resultado = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                resultado[k++] = array1[i++];
            } else {
                resultado[k++] = array2[j++];
            }
        }

        while (i < n1) {
            resultado[k++] = array1[i++];
        }

        while (j < n2) {
            resultado[k++] = array2[j++];
        }

        return resultado;
    }
}