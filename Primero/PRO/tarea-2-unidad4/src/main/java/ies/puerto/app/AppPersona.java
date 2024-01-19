package ies.puerto.app;

import ies.puerto.abstrac.EmpleadoAbstract;
import ies.puerto.abstrac.PersonaAbstract;
import ies.puerto.impl.Alumno;
import ies.puerto.impl.Profesor;

public class AppPersona {
    static EmpleadoAbstract empleadoAbstract;
    static PersonaAbstract personaAbstract;

    public static void main(String[] args) {
        Alumno alumno = new Alumno("ESO");
        Profesor profesor = new Profesor(14400, "ESO");

        System.out.println("Información sobre este profesor: \n"+profesor.toString());
        System.out.println("Su alumno está en la "+ alumno.getNivel());

    }
}
