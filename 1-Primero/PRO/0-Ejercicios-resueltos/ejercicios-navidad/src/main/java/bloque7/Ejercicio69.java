package bloque7;

/**
 * Escribe un programa que utilice un bucle for para imprimir los números pares del 2 al 20.
 */
public class Ejercicio69 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (esPar(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPar (int numero) {
        boolean esPar = false;
        if (numero % 2 == 0) {
            esPar = true;
        }
        return esPar;
    }
}
