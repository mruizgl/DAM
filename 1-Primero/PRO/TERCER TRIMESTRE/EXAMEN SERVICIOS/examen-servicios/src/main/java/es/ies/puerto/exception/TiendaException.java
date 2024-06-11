package es.ies.puerto.exception;

public class TiendaException extends Exception{

    public TiendaException(String message) {
        super(message);
    }

    public TiendaException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
