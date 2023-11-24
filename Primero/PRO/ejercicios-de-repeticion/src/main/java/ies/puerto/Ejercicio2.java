package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numeroPrimo = encontrarPrimo();
        System.out.println("Numero primo encontrado: " + numeroPrimo);
    }

    public static boolean esPrimo(int valor) {
        boolean resultado = true;

        for (int divisor = 2; divisor < valor; divisor++) {
            if (valor % divisor == 0) {
                resultado = false;
            }
        }
        return resultado;
    }

    public static int encontrarPrimo () {
        int numero = 100;

        while(true) {
            if (esPrimo(numero)) {
                break;
            }
            numero++;
        }
        return numero;
    }

}
