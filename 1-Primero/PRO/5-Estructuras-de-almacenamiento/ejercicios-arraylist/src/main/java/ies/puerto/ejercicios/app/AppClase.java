package ies.puerto.ejercicios.app;

import ies.puerto.ejercicios.impl.*;

import java.util.Arrays;
import java.util.List;

public class AppClase {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Profesor1", "12345678A", "01/01/1980", "Profesor1", 3000.0f, "Matemáticas");
        Profesor profesor2 = new Profesor("Profesor2", "87654321B", "15/05/1985", "Profesor2", 3500.0f, "Historia");
        List<Nota> notasAlumno1 = Arrays.asList(new Nota("Matemáticas", 8.5f), new Nota("Historia", 7.0f));
        List<Nota> notasAlumno2 = Arrays.asList(new Nota("Matemáticas", 9.0f), new Nota("Historia", 8.0f));
        System.out.println(notasAlumno1.toString());
        Alumno alumno1 = new Alumno("Alumno1", "23456789C", "10/02/2000", notasAlumno1);
        Alumno alumno2 = new Alumno("Alumno2", "34567890D", "05/08/2001", notasAlumno2);
        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        Aula aula1 = new Aula("Aula1", profesor1, Arrays.asList(alumno1));
        Aula aula2 = new Aula("Aula2", profesor2, Arrays.asList(alumno2));
        System.out.println(aula1.toString());
        System.out.println(aula2.toString());
        List<Aula> aulasColegio = Arrays.asList(aula1, aula2);
        Colegio colegio = new Colegio("Colegio Ejemplo", "Calle Principal 123", "Ciudad Ejemplo", aulasColegio);

    }
}
