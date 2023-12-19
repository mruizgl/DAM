package ies.puerto;

/**
 * Implementa un programa que calcule y muestre la suma de los dígitos de un número entero.
 */
public class Ejercicio3 {
    /**
     * Metodo main que ejecuta el programa
     * @param args n
     */
    public static void main(String[] args) {
        Integer numero = 123;
        int sumaDigitos = sumarDigitosEnteros(numero);
        System.out.println("La suma es " + sumaDigitos);

    }

    /**
     * Metodo que suma digito a digito un numero entero dado
     * @param numero parametro de entrada
     * @return devueve resultado
     */
    public static int sumarDigitosEnteros (Integer numero) {
        int suma = 0;
        String numeroStr = numero.toString();
        for (int i = 0; i < numeroStr.length(); i++) {
            char digito = numeroStr.charAt(i);
            String digitoStr = String.valueOf(digito);
            int digitoInt = Integer.parseInt(digitoStr);
            suma += digitoInt;
        }
        return suma;
    }


}
