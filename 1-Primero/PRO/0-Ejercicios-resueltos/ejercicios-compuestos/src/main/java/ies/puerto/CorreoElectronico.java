package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorreoElectronico {
    private static String correoElectronico;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public CorreoElectronico() {
    }

    public CorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el correo electronico");
        String correoElectronico = scanner.nextLine();
        String regex = "[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correoElectronico);
        String mensaje = "Correo inválido";
        if (matcher.matches()) {
            System.out.println("El correo electronico es valido");

        } else {
            System.out.println("La direccion de corrreo electronico no es valida");
        }


    }
}

/*
    public static void validar() {
        Scanner scanner = new Scanner(System.in);
        String correoElectronico = scanner.nextLine();
        String regex = "[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correoElectronico);
            String mensaje = "Correo inválido";
            if (matcher.matches()) {
                System.out.println("El correo electronico es valido");

            } else {
                System.out.println("La direccion de corrreo electronico no es valida");
            }


        }
    }

*/

