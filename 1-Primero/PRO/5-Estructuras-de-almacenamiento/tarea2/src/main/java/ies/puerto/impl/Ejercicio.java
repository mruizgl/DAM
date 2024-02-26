package ies.puerto.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String fechaNacimiento = scanner.nextLine();
        System.out.println("Introduzca la fecha de nacimiento en formato dd/MM/aaaa");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/aaaa");
        Date fechaActual = new Date();
        Date fechaNacimientoDate = simpleDateFormat.parse(fechaNacimiento);
        long fechaNacimientoMilis = fechaNacimientoDate.getTime();
        long fechaActualMilis = fechaActual.getTime();
        long diferencia = fechaActualMilis - fechaNacimientoMilis;
        int aniosPersona = (int) (diferencia / (1000 * 60 * 60 * 24 * 365));

        System.out.println("Usted tiene " + aniosPersona + " años");
    }
}
