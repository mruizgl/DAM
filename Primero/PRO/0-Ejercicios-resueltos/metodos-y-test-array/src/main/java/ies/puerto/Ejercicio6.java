package ies.puerto;

public class Ejercicio6 {

    /**
     * Método main que muestra la matriz transpuesta
     * @param args Muestra resultado
     */
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizTranspuesta = encontrarMatrizTranspuesta(matriz);

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        System.out.println("Matriz transpuesta:");
        mostrarMatriz(matrizTranspuesta);
    }

    /**
     * Funcion que toma la matriz original y devuelve matriz transpuesta
     * @param matriz Define la matriz
     * @return Devuelve resultado
     */
    public static int[][] encontrarMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    /**
     * Funcion que muestra la matriz en consola
     * @param matriz Define la matriz que se va a mostrar
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

