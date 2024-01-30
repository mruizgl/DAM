package ies.puerto.ejercicios.abstrac;

public abstract class Trabajador extends Persona {
    protected String nombre;
    protected float salario;

    public Trabajador(String nombre, String dni, String fechaNacimiento, String nombreTrabajador, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.nombre = nombreTrabajador;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario;
    }
}

