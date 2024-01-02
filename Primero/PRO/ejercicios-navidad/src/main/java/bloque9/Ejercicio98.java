package bloque9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que calcule y muestre el número de días entre dos fechas ingresadas por el usuario.
 */
public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Introduzca la primera fecha: ");
        String fecha1 = scanner.nextLine();
        System.out.println("Introduzca la segunda fecha: ");
        String fecha2 = scanner.nextLine();
        Date fecha1Date;
        Date fecha2Date;
        try {
            fecha1Date = dateFormat.parse(fecha1);
            fecha2Date = dateFormat.parse(fecha2);
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage() + "Por favor, introduzca formato correcto");
        }
        long fecha1Millis = fecha1Date.getTime();
        long fecha2Millis = fecha2Date.getTime();
        int resultado = (int) (Math.abs(fecha1Millis - fecha2Millis) / (1000 * 60 * 60 * 24));
        System.out.println("Los dias entre las dos fechas son " + resultado + " dias.");
    }
}
