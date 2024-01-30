package ies.puerto.ejercicios.impl;

import ies.puerto.ejercicios.abstrac.Persona;

import java.util.List;

public class Alumno extends Persona {
    private List<Nota> notas;

    public Alumno(String nombre, String dni, String fechaNacimiento, List<Nota> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    @Override
    public int anios() {
        return 0;
    }
}
