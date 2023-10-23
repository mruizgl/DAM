package ies.puerto;

/**
 * Clase que tiene como objetivo calcular el area de cuadrados y rectangulos
 * @author Melissa Ruiz
 */
public class Ejercicio3 {
    /**
     * Funcion para calcular el área de un cuadrado que es lado * lado
     * @param a lado del cuadrado
     * @return Devuelve el resultado
     */
    public int areaCuadrado(int a) {
        int resultado = a * a;

        return resultado;
    }

    /**
     * Funcion para calcular el area de un rectangulo. alto * ancho
     * @param a Alto
     * @param b Ancho
     * @return Devuelve resultado
     */
    public int areaRectangulo(int a, int b) {
        int resultado = a * b;

        return resultado;
    }
}