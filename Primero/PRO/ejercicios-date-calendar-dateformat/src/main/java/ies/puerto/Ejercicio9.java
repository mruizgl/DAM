package ies.puerto;

import java.util.Calendar;
import java.util.Date;

/**
 * Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        Date primerDiaDelMes = calendar.getTime();

        System.out.println("Primer día del mes actual: " + primerDiaDelMes);
    }
}
