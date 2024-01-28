package ies.puerto.ejercicios.abstrac;

public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected String fechaNacimiento;

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract int anios();

    @Override
    public String toString() {
        return "Persona " +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento ;
    }
}
