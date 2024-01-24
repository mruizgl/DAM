package ies.puerto;

/**
 * Clase que tiene como objetivo cargar una matriz 5x5 y despues sumar sus filas y columnas
 */
public class Ejercicio4 {
int[][] matriz = {{2, 5, 6, 2, 6}, {2, 6, 7, 5, 4}};

    /**
     * Sumar filas de la matriz establecida
     */
    public void sumaFilas () {

        for (int i = 0; i < matriz.length; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFilas += matriz [i][j];
            }
            System.out.println("La suma de la fila " + "[" + i + "] es: " + sumaFilas );
        }
    }

    /**
     * Sumar columnas de la matriz establecida
     */
    public void sumaColumnas () {

        for (int j = 0; j < matriz.length; j++) {
            int sumaColumnas = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas += matriz [i][j];
            }
            System.out.println("La suma de la fila " + "[" + j + "] es: " + sumaColumnas );
        }
    }
}
