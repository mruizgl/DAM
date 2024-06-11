package es.ies.puerto.modelo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.TiendaException;

public class Conexion  extends AppConfig{

    private Connection con;
    private String urlDb;

    public Conexion() throws TiendaException {
        super();
        this.urlDb = "jdbc:sqlite:"+getUrl();
    }
    public Connection getConexion() throws TiendaException{
        try {
            con= DriverManager.getConnection(urlDb);
        } catch (Exception e) {
            throw new TiendaException(e.getMessage(),e);
        }
        return con;
    }

    public void cerrarRecursos(ResultSet rs, Statement st) throws TiendaException{
        try {
            if (rs!=null && !rs.isClosed()) {
                rs.close();
            }
            if (rs!=null&& !st.isClosed()) {
                st.close();
            }
            if (!getConexion().isClosed()) {
                getConexion().close();
            }
        } catch (Exception e) {
            throw new TiendaException(e.getMessage(),e);
        }
    }
    public void actualizar(String query) throws TiendaException{
        Statement st = null;
        try {
            st= getConexion().createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            throw new TiendaException(e.getMessage(),e);
        }finally{
            cerrarRecursos(null, st);
        }
    }
}
