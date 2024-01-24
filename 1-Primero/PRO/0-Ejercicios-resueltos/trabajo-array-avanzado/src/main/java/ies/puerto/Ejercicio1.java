package ies.puerto;

import java.util.Scanner;

/**
 * Clase que tiene como objetivo leer por teclado las 5 notas obtenidas por un alumno mostrando todas las notas,
 * la nota media, la nota más alta que ha sacado y la menor.
 * @author Melissa Ruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        pedirDatos
    }

    /**
     * Función que muestra las 5 notas obtenidas del alumno
     * @return devuelve resultado
     */
    public static void mostrarNotas (float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(""+array[i]);
            System.out.println(array[i]);
        }
    }

    /**
     * Funcion que calcula el promedio de notas
     * @return devuelve nota media
     */
    public static double notaMedia (double[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double promedio = suma / array.length;

        return promedio;
    }

    /**
     * Funcion que indica la nota mayor
     * @return devuelve la nota mayor
     */
    public static int notaMayor() {
            int maximo = notas[0];
            for (int i = 1; i < notas.length; i++) {
                if (notas[i] > maximo) {
                    maximo = notas[i];
                }
            }
            return maximo;
    }

    /**
     * Funcion que indica la nota menor
     * @return devuelve nota menor
     */
    public static double notaMenor(double [] array) {
        double notaMenor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < notaMenor) {
                notaMenor = array[i];
            }
        }
        return notaMenor;
    }

    /**
     * Funcion que pide los valores y carga el array
     */
    public void pedirDatos () {
        float[] array = new float[5];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float temporal;
        do {
            System.out.println("Introduzca el valor: " + (i+1));
            temporal = scanner.nextFloat();

            if ((temporal >= 0) && (temporal <=10 ));
            array[i] = temporal;
            i++;
        } while (i < array.length);
    }

}
