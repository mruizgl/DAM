package ies.puerto;

/**
 * Crea un programa que verifique si una cadena de texto comienza o termina con una subcadena específica
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        String cadena = "Feliz Navidad";
        String subcadena = "Feliz";
        boolean comienzaConSubcadena = cadena.startsWith(subcadena);
        boolean terminaConSubcadena = cadena.endsWith(subcadena);

        if (comienzaConSubcadena) {
            System.out.println("La cadena comienza con la subcadena.");
        } else {
            System.out.println("La cadena no comienza con la subcadena.");
        }

        if (terminaConSubcadena) {
            System.out.println("La cadena termina con la subcadena.");
        } else {
            System.out.println("La cadena no termina con la subcadena.");
        }
    }
}
