package modelo.db;

import exception.PersonajeException;
import modelo.Personaje;
import modelo.Poder;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperacionesBd extends Conexion {
    public OperacionesBd(String url) throws PersonajeException {
        super(url);
    }

    private void actualizar(String query) throws PersonajeException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
        }
    }

    private Set<Personaje> obtener(String query) throws PersonajeException {
        Set<Personaje> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String nombrePersonaje = rs.getString("nombre");
                String aliasPersonaje = rs.getString("alias");
                String generoPersonaje = rs.getString("genero");
                Set<Poder> poderesPersonaje = rs.getString()
                Personaje personaje = new Personaje(nombrePersonaje, aliasPersonaje, aliasPersonaje, generoPersonaje);
                lista.add(personaje);
            }
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
        }
        return lista;
    }

    private String obtenerPoderes(String query) throws PersonajeException {
        Set<Poder> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {

                String poderPersonaje = rs.getString("Poder");
                Poder poder = new Poder(poderPersonaje);
                lista.add(poder);
            }
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
        }
        return lista.toString();
    }

}
