package ies.puerto.ejercicios.seis;

import ies.puerto.ejercicios.impl.Alumno;
import ies.puerto.ejercicios.impl.Nota;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    private List<Alumno> alumnos;

    public Ejercicio6() {
        this.alumnos = new ArrayList<>();
    }


    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }


    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public float calcularMediaCurso() {
        if (alumnos.isEmpty()) {
            return 0.0f; // Retornar 0 si no hay alumnos en el curso
        }

        float sumaNotas = 0.0f;
        int totalAlumnos = alumnos.size();

        for (Alumno alumno : alumnos) {
            List<Nota> notas = alumno.getNotas();
            for (Nota nota : notas) {
                sumaNotas += nota.getValor();
            }
        }

        return sumaNotas / totalAlumnos;
    }
}
