package ies.puerto;

/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto.
 */
public class Ejercicio2 {
    /**
     * Metodo main que ejecuta el programa
     * @param args n
     */
    public static void main(String[] args) {
        String cadena = "Feliz Navidad";
        int contadorVocales = contarVocales(cadena);
        System.out.println("El numero de vocales de la cadena es: " + contadorVocales);
    }

    /**
     * Funcion que cuenta el numero de vocales de una cadena dada
     * @param cadena parametro de entrada
     * @return resultado
     */
    public static int contarVocales (String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E' || caracter == 'i' || caracter == 'I' || caracter == 'o' || caracter == 'O' || caracter == 'u' || caracter == 'U') {
                contador++;
            }
        }
        return contador;
    }
}
