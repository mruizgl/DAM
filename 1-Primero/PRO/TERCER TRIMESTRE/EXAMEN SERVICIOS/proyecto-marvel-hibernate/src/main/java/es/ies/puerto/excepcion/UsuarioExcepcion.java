package es.ies.puerto.excepcion;

public class UsuarioExcepcion extends Exception {

    public UsuarioExcepcion(String message, Throwable e) {
        super(message, e);
    }
}