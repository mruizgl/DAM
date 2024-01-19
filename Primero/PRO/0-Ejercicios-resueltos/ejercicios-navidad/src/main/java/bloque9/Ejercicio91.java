package bloque9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Escribe un programa que muestre la fecha actual en el formato "dd/MM/yyyy".
 */
public class Ejercicio91 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fechaFormateada = dateFormat.format(date);
        System.out.println("La fecha es " + fechaFormateada);

    }
}
