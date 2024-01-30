package ies.puerto.ejercicios.impl;

import java.util.List;

public class Colegio {
    private String nombre;
    private String direccion;
    private String ubicacion;
    private List<Aula> aulas;

    public Colegio(String nombre, String direccion, String ubicacion, List<Aula> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.aulas = aulas;
    }

}