package bloque8;

/**
 * Desarrolla un programa que rote una matriz de 3x3, 90º grados en sentido antihorario
 */
public class Ejercicio90 {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizRotada = rotarMatrizAntihorario(matrizOriginal);

        System.out.println("Matriz original:");
        mostrarMatriz(matrizOriginal);

        System.out.println("\nMatriz rotada 90 grados en sentido antihorario:");
        mostrarMatriz(matrizRotada);
    }

    private static int[][] rotarMatrizAntihorario(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[columnas - 1 - j][i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
