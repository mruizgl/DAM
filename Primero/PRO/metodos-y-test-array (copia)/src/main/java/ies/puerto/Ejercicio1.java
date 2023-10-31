package ies.puerto;

import java.sql.Array;

/**
 * Clase que tiene como objetivo que calcular la suma de todos los elementos en un array de enteros.
 * @author Melissa Ruiz
 */
public class Ejercicio1 {
    /**
     * Clase que suma los numeros enteros de un array de cinco numeros
     * @return devuelve el resultado de la suma
     */
    public int sumaEnteros() {
        int[] array = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    /**
     * Clase que muestra por pantalla los numeros de la suma de enteros
     * @param resultado Contiene el resultado de la suma
     * @return Devuelve cadena de caracteres con el resultado
     */
    public String mostrarResultado(String resultado) {
        System.out.println("La suma de los elementos es: " + sumaEnteros());
       return resultado;
    }
}
