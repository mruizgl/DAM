package ies.puerto.ejercicios.tres;

import java.util.List;
import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private List<Float> calificaciones;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Alumno(String nombre, String apellidos, List<Float> calificaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = calificaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public float media() {
        float resultado = 0f;
        if (calificaciones.isEmpty()) {
            return resultado;
        }
        for (Float calificacion:calificaciones) {
            resultado += calificacion;
        }
        return resultado/calificaciones.size();
    }
}
