package ies.puerto;

public class Ejercicio10 {

    public static void main(String[] args) throws MiException {
        boolean verdadero = true;

        metodoConCondiciones(verdadero);
    }

    public static void metodoConCondiciones(boolean verdadero) throws MiException {
        if(verdadero) {
            throw new MiException("MiException lanza un mensaje");
        }

    }
}
