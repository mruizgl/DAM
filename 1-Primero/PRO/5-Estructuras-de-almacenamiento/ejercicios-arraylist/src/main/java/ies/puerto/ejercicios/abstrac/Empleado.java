package ies.puerto.ejercicios.abstrac;

public abstract class Empleado extends Trabajador {
    public Empleado(String nombre, String dni, String fechaNacimiento, String nombreTrabajador, float salario) {
        super(nombre, dni, fechaNacimiento, nombreTrabajador, salario);
    }

    @Override
    public String toString() {
        return "Empleado" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario;
    }
}
