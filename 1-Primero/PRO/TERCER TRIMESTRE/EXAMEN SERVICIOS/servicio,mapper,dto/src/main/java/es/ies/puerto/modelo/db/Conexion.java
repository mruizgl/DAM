package es.ies.puerto.modelo.db;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.MarvelException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion  extends AppConfig{
    private Connection con;

    private String url;

    public Conexion() throws MarvelException {
        super();
        this.url = "jdbc:sqlite:"+getUrlBd();

    }


    public Connection getConexion() throws MarvelException {
        try {
            con = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
                throw new MarvelException(e.getMessage(),e);
        }
        return con;
    }
}
