package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws ParseException {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca la fecha de nacimiento en formato dd/MM/aaaa");
            String fechaNacimiento = scanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaActual = new Date();
            Date fechaNacimientoDate = simpleDateFormat.parse(fechaNacimiento);
            long fechaNacimientoMilis = fechaNacimientoDate.getTime();
            long fechaActualMilis = fechaActual.getTime();
            int anios = (int) ((fechaActualMilis - fechaNacimientoMilis) / 1000 / 60 / 60 / 24 / 365);

            System.out.println("Usted tiene " + anios + " años");
        } catch (ParseException e) {
            System.out.println("El formato de fecha ingresado es inválido. Por favor, use el formato dd/MM/yyyy");
        }
    }
}
