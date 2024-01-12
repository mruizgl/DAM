package persona;

public class Autenticacion {
    public boolean validarCredenciales (String contrasenia) {
        if (contrasenia.length() > 8) {
            return true;
        }else {
            return false;
        }
    }
}
