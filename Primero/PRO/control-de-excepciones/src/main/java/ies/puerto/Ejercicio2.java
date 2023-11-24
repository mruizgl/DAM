package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar un número como texto y luego intente convertirlo a un entero.
 * Maneja la excepción NumberFormatException si el usuario ingresa algo que no es un número.
 */
public class Ejercicio2 {

    public static void main(String[] args) throws Exception {
        String strNumero = solicitarNumero();
        int numero = transformarStrInt(strNumero);
        System.out.println("Valor del numero transformado: " + numero);
    }

    public static String solicitarNumero () {
        String numero;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un valor: ");
        numero = scanner.nextLine();

        return numero;
    }

    public static int transformarStrInt (String strNumero) throws Exception {
        int resultado = 0;



        try {
            resultado = Integer.parseInt(strNumero);
        } catch(NumberFormatException e) {
            throw new Exception("El valor introducido: " + strNumero + ", no es un numero");
        }

        return resultado;

    }
}
