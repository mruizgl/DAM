package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            System.out.println("Revisando número: " + num);

            if ((num % 7 == 0) && (num % 5 == 0) ){
                System.out.println("Primer número divisible por 7 y 5 encontrado: " + num);
                break;
            }
        }
    }
}
