package bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que permita al usuario ingresar una fecha y un número de días,
 * y calcule la fecha resultante después de sumar esos días.
 */
public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha (formato: dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();

        System.out.print("Ingrese el número de días a sumar: ");
        int diasASumar = scanner.nextInt();

        Date fecha = convertirFecha(fechaString);

        if (fecha != null) {
            Date nuevaFecha = sumarDiasAFecha(fecha, diasASumar);

            System.out.println("La nueva fecha después de sumar " + diasASumar + " días es: " + formatearFecha(nuevaFecha));
        } else {
            System.out.println("Formato de fecha incorrecto. Use el formato dd/MM/yyyy.");
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

    private static Date sumarDiasAFecha(Date fecha, int diasASumar) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_MONTH, diasASumar);
        return cal.getTime();
    }

    private static String formatearFecha(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha);
    }
}
