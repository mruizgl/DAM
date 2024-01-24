package ies.puerto;

/**
 * Clase que tiene como objetivo calcular el area de un circulo
 * @author Melissa Ruiz
 */
public class Ejercicio2 {

    /**
     * Funcion que calcula el area de un circulo
     * @param radio Radio del circulo, valor necesario para el calculo
     * @return devuelve resultado
     */
    public double areaCirculo(int radio) {
        double pi = 3.1416;
        double resultado = (radio * radio)* pi;

        return resultado;
    }
}