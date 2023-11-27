package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una fecha en formato correcto(por ejemplo, 19-03-1997):");
        String fechaString = scanner.nextLine();

        try {

            Date fecha = convertirAFecha(fechaString);

            System.out.println("Fecha convertida con éxito: " + fecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Asegúrate de usar el formato adecuado.");
        }
    }

    private static Date convertirAFecha(String fechaString) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        return formato.parse(fechaString);
    }
}
