package ies.puerto;

/**
 * Clase que tiene como objetivo calcular el maximo de dos numeros o tres numeros
 * @author Melissa Ruiz
 */
public class Ejercicio4 {
    /**
     * Funcion que calcula el maximo de dos numeros
     * @param numero1 El primer numero para el calculo
     * @param numero2 El segundo numero para el calculo
     * @return Devuelve resultado
     */
    public static double calcularMaximo(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    /**
     * Funcion que calcula el maximo de tres numeros
     * @param numero1 El primer numero para el calculo
     * @param numero2 El segundo numero para el calculo
     * @param numero3 El tercer numero para el calculo
     * @return Devuelve resultado
     */
    public static double calcularMaximo(double numero1, double numero2, double numero3) {
        double maximoDeDos = calcularMaximo(numero1, numero2);
        return calcularMaximo(maximoDeDos, numero3);
    }
}