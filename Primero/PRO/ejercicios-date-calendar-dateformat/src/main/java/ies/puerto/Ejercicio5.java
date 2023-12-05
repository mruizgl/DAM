package ies.puerto;

import java.util.Calendar;

/**
 * Crear un programa que reste 2 meses a la fecha actual utilizando la clase Calendar.
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) +1;
        int año = calendar.get(Calendar.YEAR);
        System.out.println("Fecha actual: " +dia+ "-" + mes+ "-" + año);
        calendar.add(Calendar.MONTH, -2);
        dia = calendar.get(Calendar.DAY_OF_MONTH );
        mes = calendar.get(Calendar.MONTH) +1;
        año = calendar.get(Calendar.YEAR);
        System.out.println("Fecha sumada: " +dia+ "-" + mes+ "-" + año);
    }
}
