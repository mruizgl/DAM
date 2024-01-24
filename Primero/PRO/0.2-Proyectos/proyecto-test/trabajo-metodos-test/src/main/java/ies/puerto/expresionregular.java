package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class expresionregular {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el correo electronico");
        String correo = scanner.nextLine();
        try {
            validadorCorreo(correo);
        } catch (MiException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validadorCorreo (String correo) throws MiException {
        String regex = "^[a-zA-Z_\\.]+@[a-zA-Z]+\\.[a-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("El correo es valido");
        }else {
            throw new MiException("El correo no es valido");
        }
    }
}
