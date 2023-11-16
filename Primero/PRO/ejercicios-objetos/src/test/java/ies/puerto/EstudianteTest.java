package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    String nombre = "Juan";
    int edad = 20;
    String carrera = "Medicina";
    double promedio = 7.5;

    Estudiante estudiante;
        @BeforeEach
        public void before() {
             estudiante = new Estudiante(nombre, edad, carrera, promedio);
        }
        @Test
        public void imprimirInformacionTest() {
            String resultado = "Nombre: "+ nombre +", Edad: "+edad+", Carrera: "+carrera+", Promedio: "+promedio;
            Assertions.assertEquals(resultado, estudiante.mostrarDetalles(), "No se ha obtenido el resultado esperado");
        }
}
