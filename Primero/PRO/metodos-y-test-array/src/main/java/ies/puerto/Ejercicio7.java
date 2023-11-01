package ies.puerto;

public class Ejercicio7 {

    /**
     * Método main para mostrar en pantalla el array ordenado.
     * @param args Devuelve resultado
     */
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        ordenarArrayAscendente(array);

        System.out.println("Array ordenado en orden ascendente:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Función que ordena en orden ascendente un array
     * @param array El array que se va a ordenar
     */
    public static void ordenarArrayAscendente(int[] array) {
        int numeros = array.length;
        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < numeros; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    intercambio = true;
                }
            }
            numeros--;
        } while (intercambio);
    }
}

