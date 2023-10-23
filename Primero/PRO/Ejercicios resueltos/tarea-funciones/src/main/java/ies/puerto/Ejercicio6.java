package ies.puerto;

/**
 * Clase que convierte los grados Fahrenheit a Celsius
 * @author Melissa Ruiz
 */
public class Ejercicio6 {
    /**
     * Funcion que convierte Fahrenheit a Celsius
     * Fórmula de conversión de Fahrenheit a Celsius: (Fahrenheit - 32) * 5/9
     * @param fahrenheit Valor de Fahrenheit
     * @return Devuelve el resultado
     */
        public static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5.0 / 9.0;
        }

        public static void main(String[] args) {
            double fahrenheit = 98.6;
            double celsius = fahrenheitACelsius(fahrenheit);
            System.out.println(fahrenheit + " grados Fahrenheit son equivalentes a " + celsius + " grados Celsius.");
        }
    }

