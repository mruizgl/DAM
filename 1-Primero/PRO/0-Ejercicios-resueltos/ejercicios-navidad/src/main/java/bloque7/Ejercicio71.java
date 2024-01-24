package bloque7;


import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que simule un juego de adivinanza. Elige un número aleatorio entre 1 y 10 y pide al usuario que
 * adivine. Utiliza un bucle do-while para continuar el juego hasta que el usuario adivine el número.
 */
public class Ejercicio71 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAzar =  random.nextInt(10) ;
        int numeroElegido;
        System.out.println("¡Adivina el número que estoy pensando!");

        do {
            System.out.println("Prueba suerte, escribe el número que crees que pienso entre el 0 y 10");
            numeroElegido = scanner.nextInt();
            if (numeroElegido < 0 || numeroElegido > 10) {
                System.out.println("Error. Reinicia el programa y escriba numeros entre 0 y 10");
                break;
            }
        } while (numeroAzar != numeroElegido);
        System.out.println("Enhorabuena, adivinaste el numero. Era el numero " + numeroAzar);
    }
}
