package es.ies.puerto;
/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */
public class Palindromo {

    public boolean esPalindromo (String cadena) {
        if (cadena == null) {
            return false;
        }
        if (cadena.isEmpty()) {
            return false;
        }
        char[] array = cadena.trim().toLowerCase().toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            if (array[i] != array[i-1]) {
                return false;
            }
        }
        return true;
    }





















    public boolean esPalindromoM (String cadena) {
        if (cadena == null) {
            return false;
        }
        if (cadena.isEmpty()) {
            return false;
        }
        char[] array = cadena.toLowerCase().trim().toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            if (array[i] == array[array.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
