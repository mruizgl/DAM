package ies.puerto;

/**
 * Desarrolla un programa que convierta un número entero a su representación binaria utilizando métodos de la clase Integer.
 */
public class Ejercicio4 {
    /**
     * Metodo main que ejecuta el programa
     * @param args n
     */
    public static void main(String[] args) {
        Integer numeroEntero = 345;
        String binario = binario(numeroEntero);
        System.out.println("El numero entero en binario es: " + binario);
    }

    /**
     * Metodo que convierte a string y binario un numero entero dado utilizando el metodo toBinaryString de la clase Integer
     * @param numero parametro de entrada a convertir
     * @return devuelve resultado
     */
    public static String binario (Integer numero) {
        String binarioStr = Integer.toBinaryString(numero);
        return  binarioStr;
    }
}
