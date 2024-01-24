package ies.puerto;

import java.util.Calendar;

/**
 * Desarrollar un programa que verifique si la fecha actual es un sábado o domingo utilizando la clase Calendar
 * y muestre un mensaje apropiado
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(diaSemana);
        if (diaSemana == 7 || diaSemana == 1) {
            System.out.println("Es fin de semana");
        }else {
            System.out.println("Es entresemana");
        }
    }
}
