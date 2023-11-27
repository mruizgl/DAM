package ies.puerto;

/**
 * Crea un programa que intente acceder a un método de un objeto que es null. Por ejemplo un String.
 * Maneja la excepción NullPointerException
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = null;

        try {
            int longitud = cadena.length();
            System.out.println("La longitud de la cadena es: " + longitud);
        } catch (NullPointerException e) {
            System.out.println("El objeto está vacío, se lanza NullPointerException.");
        }
    }
}
