package bloque8;

/**
 *Escribe un programa que multiplique dos matrices de dimensiones 2x3 y 3x2, y muestre el resultado
 */
public class Ejercicio88 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {2, 3, 4},
                {5, 6, 7}
        };

        int[][] matrizB = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            System.out.println("No se puede realizar la multiplicación de matrices.");
            return;
        }

        int[][] matrizResultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < filasB; k++) {
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        System.out.println("\nEl resultado de la multiplicación de matrices es:");
        mostrarMatriz(matrizResultado);
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
