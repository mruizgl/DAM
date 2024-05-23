package campus.facil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
La función recibirá dos String y retornará un Int.
La diferencia en días será absoluta (no importa el orden de las fechas).
Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 */
public class CuantosDiasEntreDosFechas {

    public static void main(String[] args) {
        String fecha1 = "01/03/2024";
        String fecha2 = "10/03/2024";
        System.out.println("Diferencia entre fechas: " +diferenciaDias(fecha1, fecha2) + " días.");
    }
    public static int diferenciaDias (String fecha1, String fecha2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int diferenciaDias;
        try {
            Date fecha1Date = simpleDateFormat.parse(fecha1);
            Date fecha2Date = simpleDateFormat.parse(fecha2);
            diferenciaDias = (int) ((fecha1Date.getTime() - fecha2Date.getTime()) / (1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }
        return Math.abs(diferenciaDias);
    }
}
