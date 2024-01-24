package ies.puerto;

public class Ejercicio11 {
    /**
     * Crea una excepción personalizada llamada NombreInvalidoException que se lance cuando un método reciba un nombre
     * nulo o vacío como argumento. Implementa una clase que contenga un método que acepte un nombre y lance esta excepción si es inválido.
     * @param args
     */
    public static void main(String[] args) {
        String mensaje = null;

        try {
            nombreInvalido(mensaje);
        }catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("hola");
    }

    public static void nombreInvalido(String mensaje) throws NombreInvalidoException {
        if (mensaje == null || mensaje.equals("")) {
            throw new NombreInvalidoException("El mensaje no puede estar vacío");
        }

    }
}
