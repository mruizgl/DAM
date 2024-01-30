package ies.puerto.ejercicios.impl;

import java.util.List;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Aula(String nombre, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        return "Aula" +
                "nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                ", alumnos=" + alumnos;
    }
}
