package ies.puerto.abstrac;

import ies.puerto.interfaz.ITrabajador;

public abstract class EmpleadoAbstract extends PersonaAbstract implements ITrabajador  {
    private float salario;

    public EmpleadoAbstract() {
    }

    public EmpleadoAbstract(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularSalario (int diasTrabajados);

    public abstract String toString();

}
