package ies.puerto;

import java.util.Scanner;

//reloj de arena, la altura la determina el usuario
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define altura: ");
        int altura = scanner.nextInt();
        int[][] reloj = new int[altura][altura/2];
        for (int i = 0; i < altura/2; i++){
            for (int j = i; j < (altura/2)-i; j++) {

                reloj[i][j] = 1;

            }
        }
        for (int i = 0; i < altura/2; i++) {
            for (int j = 0; j < (altura/2); j++) {
                System.out.print(reloj[i][j]);
            }
            System.out.println("");
        }
    }
}
