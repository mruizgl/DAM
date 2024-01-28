package ies.puerto.ejercicios.impl;

public class Nota {
    private String nombre;
    private float valor;

    public Nota(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Nota " +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor;
    }
}
