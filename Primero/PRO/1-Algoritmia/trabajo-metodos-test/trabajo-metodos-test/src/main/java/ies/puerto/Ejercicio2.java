package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author
 */
public class Ejercicio2 {
    public static void main(String[] args) {

    }

    /**
     * Funcion que calcula el mcd de dos numeros dados
     * @param num1 para el calculo
     * @param num2 para el calculo
     * @return Resultado
     */
    public static int mcd(int numero1, int numero2) {
        int resultado = 0;
        int mayor = numero2;
        boolean encontrado = false;

        if (numero1>numero2) {
            mayor = numero1;
        }
        int i = mayor/2;
        while (encontrado == false && i > 0) {
            encontrado = true;
            resultado = i;
        }
        i--;


        return resultado;
    }

}