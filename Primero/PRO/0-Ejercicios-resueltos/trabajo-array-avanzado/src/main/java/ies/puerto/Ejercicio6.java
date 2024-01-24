package ies.puerto;

/**
 * Clase que tiene como objetivo cargar una matriz con un marco de 1 y el resto 0 y mostrarlo en pantalla
 */
public class Ejercicio6 {


    /**
     * Funcion para crear el marco de la matriz
     * @param filas de la matriz
     * @param columnas de la matriz
     * @return devuelve matriz cargada
     */
    public static int[][] crearMatrizMarco(int filas, int columnas) {
        int[][] marco = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        return marco;
    }

    /**
     * Funcion para mostrar matriz
     * @param matriz a mostrar
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}