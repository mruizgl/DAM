package ies.puerto;

import java.util.Calendar;

/**
 * Implementar un programa que sume 10 días a la fecha actual utilizando la clase Calendar.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println("Fecha actual: " +dia+ "-" + mes+ "-" + año);
    }
}
