package bloque8;

/**
 * Desarrolla un programa que sume dos matrices de 3x3 y muestre el resultado.
 */
public class Ejercicio86 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizResultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        System.out.println("\nLa suma de las matrices es:");
        mostrarMatriz(matrizResultado);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
