package bloque9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que calcule y muestre cuántos días han pasado desde una
 * fecha ingresada por el usuario hasta la fecha actual
 */
public class Ejercicio92 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        DateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato dd/MM/yyyy");
        String fechaIntroducida = scanner.nextLine();
        Date fechaIntroducidaDate;
        try {
            fechaIntroducidaDate = fechaFormato.parse(fechaIntroducida);

        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage() + "Introduzca en formato dd/MM/yy, por favor");
        }
        long fechaActualenMillis = fechaActual.getTime();
        long fechaIntroducidaenMillis = fechaIntroducidaDate.getTime();
        int resultado = (int) ((fechaActualenMillis - fechaIntroducidaenMillis) / (1000 * 60 * 60 * 24));
        System.out.println("La diferencia de dias entre la fecha actual y la fecha introducida es  " + resultado);

    }
}
