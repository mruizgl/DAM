package ies.puerto;

/**
 * @author Melissa Ruiz
 */
public class Ejercicio2 {

    public float promedioNumeros(){
        float[] array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float suma = 0;
        float promedio;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        promedio = suma / array.length;

        return promedio;
    }
}
