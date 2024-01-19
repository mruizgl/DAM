package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) throws NumeroNegativoException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta un número numero mayor o inferior a 0; ");
        int numero = scanner.nextInt();
        if (isPositivo(numero)) {
            System.out.println("El numero" + numero + " es positivo.");
        }
    }

    public static boolean isPositivo(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("El numero " + numero + ", es negativo. ");
        }
        return true;
    }
}
