package ies.puerto;

/**
 * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] numeros = new int [100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i +1;
        }


        for (int num : numeros) {
            System.out.println("Revisando número: " + num);

            if ((num % 7 == 0) && (num % 5 == 0) ){
                System.out.println("Primer número divisible por 7 y 5 encontrado: " + num);
                break;
            }
        }
    }
}
