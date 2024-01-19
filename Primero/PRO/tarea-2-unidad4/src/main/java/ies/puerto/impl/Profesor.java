package ies.puerto.impl;

import ies.puerto.abstrac.EmpleadoAbstract;


public class Profesor extends EmpleadoAbstract  {
    String especialidad;

    public Profesor(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profesor(float salario, String especialidad) {
        super(salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public float calcularSalario(int diasTrabajados) {

        return  diasTrabajados * 50.5f;

    }

    @Override
    public String toString() {
        return "El salario es " + getSalario() +" y su especialidad es: "+especialidad;
    }

    @Override
    public int anios(String fechaNacimiento) {
        return 0;
    }
}
