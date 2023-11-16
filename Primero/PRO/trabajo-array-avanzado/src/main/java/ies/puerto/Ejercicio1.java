package ies.puerto;

/**
 * Clase que tiene como objetivo leer por teclado las 5 notas obtenidas por un alumno mostrando todas las notas,
 * la nota media, la nota más alta que ha sacado y la menor.
 * @author Melissa Ruiz
 */
public class Ejercicio1 {
    int[] notas = {6, 2, 3, 2, 9,};
    /**
     * Función que muestra las 5 notas obtenidas del alumno
     * @return devuelve resultado
     */
    public String mostrarNotas () {

        return "Las notas del alumno son: " + notas;
    }

    /**
     * Funcion que calcula el promedio de notas
     * @return devuelve nota media
     */
    public double notaMedia () {
        int suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        int promedio = suma / notas.length;

        return promedio;
    }

    /**
     * Funcion que indica la nota mayor
     * @return devuelve la nota mayor
     */
    public int notaMayor() {
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
    public int notaMenor() {
        int notaMenor = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        return notaMenor;
    }

}
