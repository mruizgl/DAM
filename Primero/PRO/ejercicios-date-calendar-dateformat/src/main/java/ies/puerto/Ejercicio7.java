package ies.puerto;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Escribir un programa que calcule la diferencia en días entre dos fechas utilizando la clase Calendar.
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(Calendar.DAY_OF_MONTH, 2);
        fecha1.set(Calendar.MONTH, 2);
        fecha1.set(Calendar.YEAR, 2020);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(Calendar.DAY_OF_MONTH, 2);
        fecha2.set(Calendar.MONTH, 2);
        fecha2.set(Calendar.YEAR, 2021);


        long end = fecha2.getTimeInMillis();
        long start = fecha1.getTimeInMillis();
        int dias = (int) ((end - start)/86400000);
        System.out.println(dias);
    }
}
