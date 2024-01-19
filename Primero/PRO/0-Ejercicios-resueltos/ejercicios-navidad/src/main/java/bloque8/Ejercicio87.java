package bloque8;

/**
 * Crea un programa que tome una matriz de 3x3 y calcule su transpuesta.
 */
public class Ejercicio87 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transpuesta = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transpuesta[i][j] = matriz [j][i];
            }
        }
        mostrarMatriz(transpuesta);

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
