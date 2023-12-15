package ies.puerto;

/**
 * Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int [] [] array = new int [3] [3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array [i] [j] = (i* array.length) + (j+1);
                System.out.print(array[i][j]+"");
            }
            System.out.println("");
        }
    }
}
