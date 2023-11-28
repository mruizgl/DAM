package ies.puerto;

import java.util.Scanner;

//Escribir un programa en que dibuje un triángulo equilátero
// como muestra la figura. El usuario deberá ingresar la altura
// (número de filas que compondrán el triángulo), y el programa
// imprimirá en la consola el triángulo correspondiente. En este ejemplo se trata de un trángulo con 5 filas.
public class Ejercicio1Ok {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura del triángulo equilátero: ");
        int altura = scanner.nextInt();


        dibujarTriangulo(altura);
    }

    private static void dibujarTriangulo(int altura) {

        for (int fila = 1; fila <= altura; fila++) {
            for (int espacio = 1; espacio <= altura - fila; espacio++) {
                System.out.print(" ");
            }

            for (int uno = 1; uno <= 2 * fila - 1; uno++) {
                System.out.print("1");
            }

            System.out.println();
        }
    }
}
