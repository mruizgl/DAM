package ies.puerto;

public class Persona {
    private String nombre;
    private int edad;
    private String apellidos;

    public Persona(String nombre, int edad, String apellidos) {
        this.nombre = nombre;
        setEdad(edad);
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            this.edad = 0;
        }else {
            this.edad = edad;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }







}
