package ies.puerto;

public class Ejercicio11 {

    public static void main(String[] args) {
        String mensaje = null;

        try {
            f1(mensaje);
        }catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("hola");
    }

    public static void f1 (String mensaje) throws NombreInvalidoException {
        if (mensaje == null || mensaje.equals("")) {
            throw new NombreInvalidoException("El mensaje no puede estar vacío");
        }

    }
}
