package ies.puerto.impl;

import ies.puerto.abstrac.PersonaAbstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno extends PersonaAbstract {
    private String nivel;


    public Alumno(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public int anios(String fechaNacimiento) {
        String fechaString = fechaNacimiento;

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fechaActual = new Date();
            Date fechaNacDate = formatoFecha.parse(fechaString);
            System.out.println("Fecha parseada: " + fechaNacimiento);
            int anios = (int) ((fechaNacDate.getTime() - fechaActual.getTime()) * 1000 * 60 * 60 * 24 * 365);

            return anios;
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());

        }
        return anios;
    }

    public String estudiar() {
        return "El alumno estudia en el nivel "+nivel;
    }
}
