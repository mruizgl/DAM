package bloque8;

/**
 * Haz un programa que calcule el promedio de las notas almacenadas en un array de decimales.
 */
public class Ejercicio84 {
    public static void main(String[] args) {
        double[] notas = {4.5, 6.8, 9.5, 7.5, 6.4, 6.4};
        int suma = 0;
        int asignaturas = notas.length;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedio = suma / asignaturas;
        System.out.println("El promedio de las notas es " + promedio);
    }
}
