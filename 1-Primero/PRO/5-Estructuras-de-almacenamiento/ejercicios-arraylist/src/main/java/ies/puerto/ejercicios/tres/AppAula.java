package ies.puerto.ejercicios.tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {
    static Aula dam1;
    public static void main(String[] args) {
      dam1 = new Aula("1DAM");
      Alumno alumno1 = new Alumno("nombre1","apellido1", Arrays.asList(1f, 5f, 6f));
      Alumno alumno2 = new Alumno("nombre2", "apellido2", Arrays.asList(4f, 6f, 7f, 9f));
      List<Alumno> alumnos = new ArrayList<>();
      alumnos.add(alumno1);
      alumnos.add(alumno2);
      dam1.setAlumnos(alumnos);

      System.out.println("Media aula: "+dam1.media());
    }
}
