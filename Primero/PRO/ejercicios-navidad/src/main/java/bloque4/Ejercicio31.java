package bloque4;

/**
 * Escribe un programa que compare dos números enteros ingresados por el usuario y muestre cuál es mayor o si son iguales.
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        int numero1 = 8;
        int numero2 = 12;

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        }else {
            System.out.println(numero2 + " es mayor que " + numero1);
        }
    }
}
