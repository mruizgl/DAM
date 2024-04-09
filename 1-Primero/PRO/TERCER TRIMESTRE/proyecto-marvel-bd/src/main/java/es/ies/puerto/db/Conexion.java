package es.ies.puerto.db;

import es.ies.puerto.exception.PersonajeException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;

    private String url;
    private String user;
    private String password;

    public Conexion(String url) {
        super();
        this.url = "jdbc:sqlite:"+url;
    }

    public Conexion(String url, String user, String password) throws PersonajeException {
        super();
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConexion() throws PersonajeException {
        try {
            this.con = DriverManager.getConnection(url);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new PersonajeException("No se ha podido establecer la conexion",
                    exception);
        }
        return con;
    }
}
