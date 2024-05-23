package campus.facil;

import java.util.Scanner;

/*
Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cadena para invertir");
        String cadena = sc.nextLine();
        int largo = cadena.length();

        for (int i = largo - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}
