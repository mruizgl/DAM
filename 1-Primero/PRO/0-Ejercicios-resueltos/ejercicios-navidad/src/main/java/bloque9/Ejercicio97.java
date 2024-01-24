package bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar su fecha de nacimiento y
 * muestre su edad exacta en años, meses y días
 */
public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su fecha de nacimiento (formato: dd/MM/yyyy): ");
        String fechaNacimientoString = scanner.nextLine();

        Date fechaNacimiento = convertirFecha(fechaNacimientoString);

        if (fechaNacimiento != null) {
            int[] edad = calcularEdad(fechaNacimiento);
            System.out.println("Su edad es: " + edad[0] + " años, " + edad[1] + " meses y " + edad[2] + " días.");
        } else {
            System.out.println("Formato de fecha incorrecto. Use el formato dd/MM/yyyy");
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

    private static int[] calcularEdad(Date fechaNacimiento) {
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaNacimiento);
        Calendar fechaActualCal = Calendar.getInstance();

        int anios = fechaActualCal.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);
        int meses = fechaActualCal.get(Calendar.MONTH) - fechaNacimientoCal.get(Calendar.MONTH);
        int dias = fechaActualCal.get(Calendar.DAY_OF_MONTH) - fechaNacimientoCal.get(Calendar.DAY_OF_MONTH);

        if (dias < 0) {
            meses--;
            fechaActualCal.add(Calendar.MONTH, -1);
            dias += fechaActualCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (meses < 0) {
            anios--;
            fechaActualCal.add(Calendar.YEAR, -1);
            meses += 12;
        }

        return new int[]{anios, meses, dias};
    }
}
