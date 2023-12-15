package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número impar: ");
        int numero = scanner.nextInt();
        if (numero % 2 != 0) {
            pintarRombo(numero);
        }else {
            System.out.println("El número debe ser impar.");
        }
    }

    public static void pintarRombo (int numero) {
        int asterisco = 1;
        int espacios = (numero/2);
        for (int i = 0; i <= numero / 2; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < asterisco; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            System.out.println("");

            asterisco = asterisco +2;
            espacios--;
        }

    }

}


//pintaremos tantas lineas como numero de diagonal se introduzca
//cada fila es un numero de espacios a la izq, asteriscos al medio y espacios a la dcha
//pintar mitad con un patron, y la mitad de abajo con otro
