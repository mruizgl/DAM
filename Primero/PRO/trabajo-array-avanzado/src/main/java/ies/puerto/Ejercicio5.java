package ies.puerto;

/**
 * Clase que tiene como objetivo cargar la tabla de forma que los componentes pertenecientes a la diagonal
 * de la matriz tomen el valor 1 y el resto el valor 0 y muestra en pantalla el resultado.
 */
public class Ejercicio5 {

    /**
     * Funcion que carga la matriz con 1 en la diagonal y el resto 0
     * @return devuelve resultado
     */
    public int [] [] cargarDiagonal () {
        int[][] diagonal = new int [5] [5];

        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] [i] = 1;
        }

        return diagonal;
    }

    /**
     * Funcion que muestra en pantalla la diagonal
     * @return devuelve resultado
     */
    public String mostrarMatriz() {

        return "La matriz es: " + cargarDiagonal();

    }
}

