package ies.puerto;

import java.util.Date;

/**
 * Crear un programa que muestre la fecha y hora actuales utilizando la clase Date.
 */
public class Ejercicio1 {


    /**
     * Método main para ejecutar el programa
     * @param args
     */
    public static void main(String[] args) {
        String fecha = obtenerFechaActual();
        System.out.println("La fecha y hora actuales son: " + fecha);
    }

    /**
     * Función que obtiene la fecha actual cuando se ejecuta el programa
     * @return devuelve resultado
     */
    public static  String obtenerFechaActual () {
        Date date = new Date();
        String fechaActual = date.toString();

        return fechaActual;
    }
}
