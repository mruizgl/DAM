package campus.facil;

import java.util.Scanner;

/**
 * Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 */
public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el texto que desee comprobar si es palindromo");
        String cadena = scanner.nextLine();
        System.out.println(cadena);
        System.out.println(invertirCadena(cadena));
        System.out.println(esPalindromo(cadena));

    }

    public static boolean esPalindromo(String cadena) {
        String cadenaSinEspacios = cadena.replace(" ", "");
        if (cadenaSinEspacios.equalsIgnoreCase(invertirCadena(cadenaSinEspacios))) {
            return true;
        }
        return false;
    }

    public static String invertirCadena (String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += String.valueOf(cadena.charAt(i));
        }
        return cadenaInvertida.replaceFirst("\\s+", "");
    }
}
