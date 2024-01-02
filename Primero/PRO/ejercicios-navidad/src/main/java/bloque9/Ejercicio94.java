package bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que, dado un mes y año ingresados por el usuario,
 * calcule y muestre cuántos días faltan hasta el final del mes.
 */
public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mes (formato: MM): ");
        String mesString = scanner.nextLine();

        System.out.print("Ingrese el año (formato: YYYY): ");
        String anioString = scanner.nextLine();

        Date fechaActual = new Date();
        Date fechaIngresada = convertirFecha(anioString + "-" + mesString + "-01");

        if (fechaIngresada != null) {
            int diasRestantes = calcularDiasRestantes(fechaIngresada, fechaActual);
            System.out.println("Faltan " + diasRestantes + " días hasta el final del mes.");
        } else {
            System.out.println("Formato de fecha incorrecto. Use el formato MM y YYYY.");
        }

    }

    private static Date convertirFecha(String fechaString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int calcularDiasRestantes(Date fechaIngresada, Date fechaActual) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaIngresada);
        int ultimoDiaDelMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        cal.setTime(fechaActual);
        int diaActual = cal.get(Calendar.DAY_OF_MONTH);

        return ultimoDiaDelMes - diaActual;
    }
}
