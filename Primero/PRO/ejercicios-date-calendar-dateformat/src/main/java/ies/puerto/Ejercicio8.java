package ies.puerto;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementar un programa que parsee una cadena en formato "dd-MM-yyyy" a un objeto Date utilizando SimpleDateFormat.
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        String fechaString = "01-12-2023";

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha = formatoFecha.parse(fechaString);
            System.out.println("Fecha parseada: " + fecha);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());;
        }
    }
}
