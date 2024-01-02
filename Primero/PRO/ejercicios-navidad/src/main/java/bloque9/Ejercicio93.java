package bloque9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que determine el día de la semana de una fecha ingresada
 * por el usuario (por ejemplo, lunes, martes, etc.).
 */
public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha (formato: dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();

        Date fecha = convertirFecha(fechaString);

        if (fecha != null) {
            String diaDeLaSemana = obtenerDiaDeLaSemana(fecha);

            System.out.println("El día de la semana para " + fechaString + " es: " + diaDeLaSemana);
        } else {
            System.out.println("Formato de fecha incorrecto. Use el formato dd/MM/yyyy");
        }
    }

    public static Date convertirFecha(String fechaString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String obtenerDiaDeLaSemana(Date fecha) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        return dayFormat.format(fecha);
    }
}
