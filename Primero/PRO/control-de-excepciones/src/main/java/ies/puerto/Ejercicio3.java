package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] array = new int[3];

        try {
            int valor = array[4];
            System.out.println("El valor obtenido es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Acceso a un índice fuera de los límites del array.");

        }
    }
}
