package bloque8;

/**
 * Haz un programa que busque el número máximo en una matriz de 4x4 y muestre su posición
 */
public class Ejercicio89 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int maximo = matriz[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
            }
        }
        System.out.println("La matriz es:");
        mostrarMatriz(matriz);

        System.out.println("\nEl número máximo es " + maximo + " y se encuentra en la posición [" +
                (filaMaximo + 1) + "][" + (columnaMaximo + 1) + "].");
    }

    /**
     * Método para mostrar matriz
     * @param matriz de entrada
     */
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
