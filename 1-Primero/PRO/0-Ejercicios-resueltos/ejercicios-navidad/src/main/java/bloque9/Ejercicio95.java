package bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que compare dos fechas ingresadas por el usuario y determine cuál es anterior, o si son iguales.
 */
public class Ejercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera fecha (formato: YYYY-MM-DD): ");
        String fechaString1 = scanner.nextLine();

        System.out.print("Ingrese la segunda fecha (formato: YYYY-MM-DD): ");
        String fechaString2 = scanner.nextLine();

        Date fecha1 = convertirFecha(fechaString1);
        Date fecha2 = convertirFecha(fechaString2);

        if (fecha1 != null && fecha2 != null) {
            int comparacion = compararFechas(fecha1, fecha2);

            if (comparacion < 0) {
                System.out.println("La primera fecha es anterior a la segunda fecha.");
            } else if (comparacion > 0) {
                System.out.println("La segunda fecha es anterior a la primera fecha.");
            } else {
                System.out.println("Las fechas son iguales.");
            }
        } else {
            System.out.println("Formato de fecha incorrecto. Use el formato YYYY-MM-DD.");
        }
    }

    private static Date convertirFecha(String fechaString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int compararFechas(Date fecha1, Date fecha2) {
        return fecha1.compareTo(fecha2);
    }
}
