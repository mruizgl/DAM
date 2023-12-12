package ies.puerto;

/**
 * Implementa un programa que invierta una cadena de texto dada. La cadena debe de tener al menos 10 caracteres no vacíos.
 */
public class Ejercicio1 {

    /**
     * Metodo main que ejecuta el programa
     * @param args n
     */
    public static void main(String[] args) {
        String cadena = "Feliz Navidad";
        String cadenaInvertida = invertirCadena(cadena);

        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }

    /**
     * Método que invierte una cadena de texto dada
     * @param cadena parametro de entrada a invertir
     * @return devuelve resultado
     */
    public static String invertirCadena (String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i) ;
        }
        return  cadenaInvertida;

    }
}
