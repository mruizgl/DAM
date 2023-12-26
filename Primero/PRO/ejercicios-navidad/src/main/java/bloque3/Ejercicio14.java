package bloque3;

import java.util.Scanner;

/**
 * Escribe un programa que utilice una variable booleana para determinar si un número ingresado por el usuario es par o impar.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        boolean esPar = false;
        System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            esPar = true;
        }
        if (esPar == true) {
            System.out.println("El numero es par");
        }else if (esPar == false){
            System.out.println("El numero es impar");
        }

    }
}
