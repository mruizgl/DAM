package bloque8;

/**
 * Escribe un programa que cuente cuántas veces aparece un número específico en un array de enteros.
 */
public class Ejercicio85 {
    public static void main(String[] args) {
        int[] array = {6, 6, 7, 5, 6, 7, 8};
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                contador++;
            }
        }
        System.out.println("El numero de veces que se repite el numero 6 es " + contador);
    }
}
