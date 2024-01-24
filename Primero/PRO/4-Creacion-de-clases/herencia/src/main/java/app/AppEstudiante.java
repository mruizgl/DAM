package app;

import excepciones.ValidacionException;
import persona.Autenticacion;
import persona.Estudiante;
import persona.Persona;

import java.util.Arrays;
import java.util.Scanner;

public class AppEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autenticacion autenticacion = new Autenticacion();

        System.out.println("Cree una contraseña con mínimo 8 caracteres");
        String contrasenia = scanner.nextLine();
        autenticacion.validarCredenciales(contrasenia);
        
        System.out.println("Introduce la contraseña que has creado para acceder a los datos del alumno");
        String introducido = scanner.nextLine();
        if (contrasenia.equals(introducido)) {
            System.out.println("Autenticación válida");
        }else {
            System.out.println("Contraseña incorrecta. Reinice el programa");
        }

        System.out.println("Seleccione opción"+"\n1. Mostrar nombre de alumno."+"\n2. Mostrar edad de alumno."+"\n3. Mostrar DNI"+"\n4. Mostrar curso"+"\n5. Mostrar notas");
        int seleccion = scanner.nextInt();
        double [] notas = {6.8, 8.5, 9.5, 4.9};
        Estudiante estudiante1 = new Estudiante("Juan", 25, "4846556D", "Diseño Gráfico", notas);


        switch (seleccion) {
            case 1:
                System.out.println("EL nombre del alumno es " + estudiante1.getNombre());
            case 2:
                System.out.println("La edad del alumno es " + estudiante1.getEdad());
            case 3:
                System.out.println("El DNI del estudiante es: " + estudiante1.getDni());
            case 4:
                System.out.println("El curso en el que está el estudiante es " + estudiante1.getCurso());
            case 5:
                System.out.println("Las notas del alumno son " + Arrays.toString(estudiante1.getNotas()));
        }



    }
}
