package ies.puerto;

public class Ejercicio10 {

    public static void main(String[] args)  { //nunca poner throws en main porque no hay nada arriba
        boolean verdadero = true;
        try {
            metodoConCondiciones(verdadero);
        }catch (MiException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void metodoConCondiciones(boolean verdadero) throws MiException { //puede lanzar
        if(verdadero) {
            throw new MiException("MiException lanza un mensaje"); //lanza
        }

    }
}
