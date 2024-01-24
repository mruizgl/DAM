package bloque3;

/**
 * Escribe un programa que declare dos variables de tipo entero e imprima su suma, resta, multiplicación y división.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 8;
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        System.out.println("La suma de 10 y 8 es " + suma + ", su resta es " + resta + ", su multiplicacion es " + multiplicacion + " y su division es " +division);
    }
}
