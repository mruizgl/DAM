package es.ies.puerto.model.jdbc;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.excepcion.UsuarioExcepcion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion extends AppConfig {
    Connection con;
    public  Connection getConnection()throws UsuarioExcepcion {
        try {
            con=DriverManager.getConnection("jdbc:sqlite:"+getUrl());
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }
        return con;
    }

}
