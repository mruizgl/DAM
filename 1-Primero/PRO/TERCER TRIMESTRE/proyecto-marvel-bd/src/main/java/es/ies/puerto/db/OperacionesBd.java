package es.ies.puerto.db;

import es.ies.puerto.Poder;
import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

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
        Set<Poder> poderes;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int idPersonaje = rs.getInt("id");
                String nombrePersonaje = rs.getString("nombre");
                String aliasPersonaje = rs.getString("alias");
                String generoPersonaje = rs.getString("genero");
                poderes = obtenerPoderesSet(idPersonaje);
                Personaje personaje = new Personaje(idPersonaje, nombrePersonaje, aliasPersonaje, generoPersonaje, poderes);
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

    private Set<Poder> obtenerPoderesSet(int id) throws PersonajeException {
        String query = "SELECT p.id, po.poder " +
                "FROM Personajes AS p " +
                "JOIN Poderes AS po ON p.id = po.personaje_id " +
                "WHERE p.id = '"+id+"'";
        Set<Poder> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int poderId = rs.getInt("id");
                String poderPersonaje = rs.getString("poder");
                Poder poder = new Poder(poderId, poderPersonaje);
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
        return lista;
    }

    public Set<Personaje> obtenerPersonajes() throws PersonajeException {
        String query = "select p.id, p.nombre, p.alias, p.genero, po.poder from personajes as p join poderes as po where p.id = po.personaje_id";
        return obtener(query);
    }

    public Personaje obtenerPersonaje(Personaje personaje) throws PersonajeException {
        String query = "select p.nombre, p.alias, p.genero, po.poder from personajes as p" +
                " where p.id="+personaje.getId()+"";
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje(Personaje personaje) throws PersonajeException {
        String query = "INSERT INTO personajes (id, nombre, alias, genero) VALUES " +
                "(" + personaje.getId() + ", '" + personaje.getNombre() + "', '" + personaje.getAlias() + "', '" +
                personaje.getGenero() + "')";
        actualizar(query);
    }


    public void actualizarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "update personajes set id= "+personaje.getId()+" nombre='"+personaje.getNombre()+"', " +
                "alias='"+personaje.getAlias()+"', genero="+personaje.getAlias()+", poder= '"+personaje.getPoderes()+"' " +
                "where id='"+personaje.getNombre()+"'";
        actualizar(query);
    }
    public void eliminarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "delete FROM personajes" +
                " where id="+personaje.getId();
        actualizar(query);
    }

}
