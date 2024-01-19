package ies.puerto;

public class MiException extends Exception {
    private int codigoError;

    public MiException () {}

    public MiException(int codigo) {
        this.codigoError = codigo;
    }

    public MiException (String mensaje) {
        super(mensaje);
    }

    public MiException (int codigo, String mensaje) {
        super(mensaje);
        this.codigoError = codigo;

    }
}
