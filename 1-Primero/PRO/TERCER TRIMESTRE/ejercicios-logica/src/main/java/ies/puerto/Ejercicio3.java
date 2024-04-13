package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args) {
        String texto = "hola hOla holA hOla".toLowerCase();
        String palabraABuscar = "hola";
        int contador = 0;

        String[] cadena = texto.split("\\s+");

        for (String palabras : cadena) {
            if (palabras.equals(palabraABuscar)) {
                contador++;
            }
        }
        System.out.println("La palabra "+ palabraABuscar+ " aparece " +contador+ " veces");

    }
}
