package ies.puerto.ejercicios.impl;


import ies.puerto.ejercicios.abstrac.Empleado;

public class Profesor extends Empleado {
    private String especialidad;

    public Profesor(String nombre, String dni, String fechaNacimiento, String nombreTrabajador, float salario, String especialidad) {
        super(nombre, dni, fechaNacimiento, nombreTrabajador, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public int anios() {
        return 0;
    }

    @Override
    public String toString() {
        return "Profesor" +
                "especialidad='" + especialidad;
    }
}
