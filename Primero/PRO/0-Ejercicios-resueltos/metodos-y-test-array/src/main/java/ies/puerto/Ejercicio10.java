package ies.puerto;

public class Ejercicio10 {

    /**
     * Método main que ejecuta el programa y muestra en pantalla si la matriz es diagonal
     * @param args Muestra numeros pares
     */
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        };

        boolean esDiagonal = esMatrizDiagonal(matriz);

        if (esDiagonal) {
            System.out.println("La matriz es diagonal.");
        } else {
            System.out.println("La matriz no es diagonal.");
        }
    }

    /**
     * Método que comprueba si la matriz es diagonal
     * @param matriz Elementos de la matriz
     * @return Devuelve resultado
     */
    public static boolean esMatrizDiagonal(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}

