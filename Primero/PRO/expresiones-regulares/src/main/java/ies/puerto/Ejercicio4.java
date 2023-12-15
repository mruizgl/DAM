package ies.puerto;

/**
 *
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int diagonal = 11;
        int numAsteriscos = 1, numEspacios;

        //0 es sumar, 1 es restar
        int modo = 0;

        for (int fila = 0; fila < diagonal; fila++) {
            numEspacios = (diagonal - numAsteriscos) / 2;

            //espacios de la izquierda
            for (int columna = 0; columna < numEspacios; columna++) {
                System.out.print(" ");
            }

            //asteriscos
            for (int columna = 0; columna < numAsteriscos; columna++) {
                System.out.print("*");
            }

            //espacios derecha
            for (int columna = 0; columna < numEspacios; columna++) {
                System.out.print(" ");
            }

            System.out.println();

            if (numAsteriscos == diagonal) {
                modo = 1;
            }

            if (modo == 0) {
                numAsteriscos = numAsteriscos + 2;
            }else {
                numAsteriscos = numAsteriscos - 2;
            }
        }
    }
}
