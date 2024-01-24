package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();
    @Test
    public void calcularDiaSemanaTestOK(String strDia, int numero) {
        verificarDíaSemana (Lunes, 1)
        verificarDiaSemana (Martes, 2)

        resultado = ejercicio7.calcularDiaSemana(1);
        Assertions.assertEquals(strDia, resultado, "No se ha obtenido el resultado esperado");

    }
    @Test
    public void calcularLunesTestOK(String strDia, int numeroDia) {
        String resultado = "";


    }
}
