package es.ies.puerto.modelo.db;

import es.ies.puerto.modelo.Poder;
import exception.PersonajeException;
import es.ies.puerto.modelo.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
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
                Set poderes = obtenerPoderesSet(nombrePersonaje);
                Personaje personaje = new Personaje(nombrePersonaje, aliasPersonaje, generoPersonaje, poderes);
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

    private Set<Poder> obtenerPoderesSet(String nombre) throws PersonajeException {
        String query = "select p.nombre, p.alias, p.genero, po.poder from personajes as p join poderes as po where p.id = po.personaje_id and p.nombre ="
                + "'" +nombre +"'";
        Set<Poder> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int personajeId = rs.getInt("personaje_id");
                String poderPersonaje = rs.getString("poder");
                Poder poder = new Poder(personajeId, poderPersonaje);
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
        String query = "select p.nombre, p.alias, p.genero, po.poder from personajes as p join poderes as po where p.id = po.personaje_id";
        return obtener(query);
    }

    public Personaje obtenerUsuario(Personaje personaje) throws PersonajeException {
        String query = "select p.nombre, p.alias, p.genero, po.poder from personajes as p" +
                " where p.nombre='"+personaje.getNombre()+"'";
        Set<Personaje> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarUsuario(Personaje personaje) throws PersonajeException {
        String query = "INSERT INTO personajes as p (nombre, alias, genero, poderes)" +
                " VALUES ('"+personaje.getNombre()+"',"
                + personaje.getAlias()+"," +
                " '"+personaje.getGenero()+"', '"+personaje.getPoderes()+"')";
        actualizar(query);
    }

    public void actualizarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "update personajes set nombre='"+personaje.getNombre()+"', " +
                "alias='"+personaje.getAlias()+"', genero="+personaje.getAlias()+", poder= '"+personaje.getPoderes()+"' " +
                "where id='"+personaje.getNombre()+"'";
        actualizar(query);
    }
    public void eliminarPersonaje(Personaje personaje) throws PersonajeException{
        String query = "delete FROM personajes as p" +
                " where p.nombre='"+personaje.getNombre()+"'";
        actualizar(query);
    }

}
