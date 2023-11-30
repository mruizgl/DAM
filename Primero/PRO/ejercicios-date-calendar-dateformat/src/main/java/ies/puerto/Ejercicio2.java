package ies.puerto;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desarrollar un programa que formatee la fecha actual en el formato "dd-MM-yyyy HH:mm:ss" utilizando la clase
 * SimpleDateFormat de DateFormat
 */
public class Ejercicio2 {


    /**
     * Método donde se le da formato a la fecha y se muestra en pantalla
     * @param args
     */
    public static void main(String[] args) {
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fechaActual);
        System.out.println("Fecha formateada: " + fechaFormateada);
    }

}
