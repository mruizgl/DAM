package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número divisible por 5 y mayor que 30, utilizando break.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numero = 31;

        while(true) {
            if (numero % 5 == 0) {
                break;
            }
            numero++;
        }
        System.out.println("El número es: " + numero);
    }
}
