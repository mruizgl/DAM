package bloque9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que, dado un número de días ingresado por el usuario, calcule y muestre la fecha resultante
 * en el futuro desde la fecha actual.
 */
public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de días a sumar: ");
        int diasASumar = scanner.nextInt();
        Date fechaEnElFuturo = calcularFechaEnElFuturo(diasASumar);

        System.out.println("La fecha en el futuro después de sumar " + diasASumar + " días es: " + formatearFecha(fechaEnElFuturo));


    }

    public static Date calcularFechaEnElFuturo(int diasASumar) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, diasASumar);
        return cal.getTime();
    }

    public static String formatearFecha(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha);
    }
}
