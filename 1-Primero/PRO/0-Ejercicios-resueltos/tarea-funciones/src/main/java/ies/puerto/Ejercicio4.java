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
    public static int calcularMaximo(int numero1, int numero2) {
        int resultado = numero1;
            if (numero2 > numero1) {
                resultado = numero2;
        }
            return resultado;
    }


    /**
     * Funcion que calcula el maximo de tres numeros
     * @param numero1 El primer numero para el calculo
     * @param numero2 El segundo numero para el calculo
     * @param numero3 El tercer numero para el calculo
     * @return Devuelve resultado
     */
    public static int calcularMaximo(int numero1, int numero2, int numero3) {
        int maximoDeDos = calcularMaximo(numero1, numero2);
        return calcularMaximo(maximoDeDos, numero3);
    }
}