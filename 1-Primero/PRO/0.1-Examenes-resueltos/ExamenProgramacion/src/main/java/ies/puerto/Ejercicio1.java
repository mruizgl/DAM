package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {




        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero de columnas para el dibujo: ");
        int columnas=sc.nextInt();
        if(columnas<4){

            throw new Exception("No se puede poner menos de 4 columnas");
        }


        for (int i = 0; i <= columnas ; i++) {
            System.out.println();

             for (int j = i; j <= columnas - i - 1  ; j++) {

                System.out.print("*");

            }




        }



    }



}
