package ies.puerto;

public class Ejercicio7 {

    public static void main(String[] args) {
        try {
            validarNumero(5);
            System.out.println("Número válido");

            validarNumero(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Número inválido: " + e.getMessage());
        }
    }

    public static void validarNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        System.out.println("Número válido. Realizando operación...");
    }
}
