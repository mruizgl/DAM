package ies.puerto;
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String mensaje = "";
            int numero = i;

            if (numero % 3 == 0) {
                mensaje += "fizz";
                System.out.println(mensaje);
            }
            if (numero % 5 == 0) {
                mensaje += "buzz";
                System.out.println(mensaje);
            }
            System.out.println(i);
        }
    }
}
