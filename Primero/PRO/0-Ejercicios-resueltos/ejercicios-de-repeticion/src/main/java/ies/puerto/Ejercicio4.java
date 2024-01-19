package ies.puerto;

public class Ejercicio4 {

    public static void main(String[] args) {
        int [] numeros = {5,7,10,-3};

        for (int i = 0; i< numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("Número encontrado en la posicion: " + i);
                break;
            }
        }
    }
}
