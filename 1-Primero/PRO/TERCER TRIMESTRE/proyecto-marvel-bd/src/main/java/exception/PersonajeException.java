package exception;

public class PersonajeException extends Exception {
    public PersonajeException(String message) {
        super(message);
    }

    public PersonajeException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
