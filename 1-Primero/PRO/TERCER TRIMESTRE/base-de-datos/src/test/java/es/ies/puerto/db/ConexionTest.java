package es.ies.puerto.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConexionTest {
    Conexion conexion;
    String url = "src/main/resources/usuarios.db";
    @BeforeEach
    public void beforeEach () {
        conexion = new Conexion(url);

    }

    @Test
    public void conectarBd() {
        try {
            conexion.getConexion();
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
