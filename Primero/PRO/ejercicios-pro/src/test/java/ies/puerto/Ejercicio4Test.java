package ies.puerto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Ejercicio4Test {
    String titular = "Juan Pérez";
    double saldo = 2000;
    @BeforeEach
    public void before() {
    Ejercicio4 miCuenta = new Ejercicio4(titular, saldo);
}

    @Test
    public void imprimirInformacionTestOk() {
        String resultado = "El usuario es: " + titular + " y su saldo actual es de: " + saldo;
    }

    @Test

}
