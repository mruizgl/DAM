package bloque9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que determine si una fecha ingresada por el usuario corresponde a un día festivo específico
 * (por ejemplo, Navidad o Año Nuevo) y muestre un mensaje adecuado.
 */
public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha (formato: dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();

        Date fechaIngresada = convertirFecha(fechaString);

        if (fechaIngresada != null) {
            if (esNavidad(fechaIngresada)) {
                System.out.println("¡Feliz Navidad!");
            } else if (esAnoNuevo(fechaIngresada)) {
                System.out.println("¡Feliz Año Nuevo!");
            } else {
                System.out.println("La fecha ingresada no es navidad ni fin de año.");
            }
        } else {
            System.out.println("Formato de fecha incorrecto. Use el format dd/MM/yyyy.");
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
    private static boolean esNavidad(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
        String fechaSinAnio = dateFormat.format(fecha);
        return "1225".equals(fechaSinAnio);
    }

    private static boolean esAnoNuevo(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
        String fechaSinAnio = dateFormat.format(fecha);
        return "0101".equals(fechaSinAnio);
    }
}
