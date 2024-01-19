package ies.puerto;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividirNumeros(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    private static double dividirNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("División por cero");
        }

        return numero1 / numero2;
    }
}
