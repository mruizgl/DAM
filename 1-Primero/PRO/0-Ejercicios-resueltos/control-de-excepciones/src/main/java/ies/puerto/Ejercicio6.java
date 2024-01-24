package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto
 * y luego intente convertirla a un objeto Date. Maneja la excepción ParseException.
 */
public class Ejercicio6 {

    /**
     * Metodo main para ejecutar el programa
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una fecha en formato correcto(por ejemplo, 19-03-1997):");
        String fechaString = scanner.nextLine();

        Date fecha = convertirAFecha(fechaString);
    }

    /**
     * Función que convierte los valores que se introduzcan a tipo Date
     * @param fechaString parámetro de entrada
     * @return devuelve resultado
     * @throws ParseException se propaga la excepcion
     */
    public static Date convertirAFecha(String fechaString) {
        Date fecha = null;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fecha = formato.parse(fechaString);
        }catch (ParseException e) {
            System.out.println("Estoy capturando una excepción porque tengo fecha incorrecta.");
        }
       return fecha;
    }
}
