package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desarrollar un programa que compare dos fechas utilizando la clase Date y muestre si son iguales o diferentes.
 */
public class Ejercicio6 {

    public static void main(String[] args)  {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formato.parse("35/1/2015");
            Date otroDate = new Date();

            if (date.equals(otroDate)) {
                System.out.println("Las fechas son iguales");
            }else {
                System.out.println("Las fechas son distintas");
                if (date.before(otroDate)) {
                    System.out.println("La fecha date es anterior");
                }
            }
        }catch (ParseException e) {
            System.out.println(e.getMessage());
        }


    }
}
