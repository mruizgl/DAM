package ies.puerto;

import java.util.Scanner;

/**
 * @author Melissa Ruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        int numero1 = solicitarNumero();
        int numero2 = solicitarNumero();
        int resultado = division(numero1, numero2);

        System.out.println("El resultado es: " + resultado);


    }

    /**
     * Funcion que pide por teclado un numero
     * @return numero obtenido
     */
    public static int solicitarNumero () {
        int numero;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un valor: ");
        numero = scanner.nextInt();

        return numero;
    }

    /**
     * Funcion que realiza la division de dos numeros
     * @param dividendo de la division
     * @param divisor de la division
     * @return resultado
     */
    public static int division(int dividendo, int divisor) throws Exception {
        int resultado = 0;

        try {
            resultado = dividendo/divisor;
        }catch (ArithmeticException e) {
            String mensajeError = "Se intenta realizar una division por 0";
            System.out.println("Mensaje del println " + mensajeError);

            throw new Exception(mensajeError);
        }


        return resultado;
    }
}
