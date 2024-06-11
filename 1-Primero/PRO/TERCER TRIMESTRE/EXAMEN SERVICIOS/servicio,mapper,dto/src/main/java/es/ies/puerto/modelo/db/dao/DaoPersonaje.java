package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoPersonaje extends Conexion  {
     
    public DaoPersonaje() throws MarvelException {
        super();
    }

    public Set<Personaje> findAllPersonaje() throws MarvelException {
        Set<Personaje>lista = new HashSet<>();
        Statement st = null;
        ResultSet rs = null;
        String query = "select * from Personaje";
        try {
            st = getConexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
                Personaje personaje = new Personaje(id, nombre, genero,null,null,null);
                lista.add(personaje);
            }
        } catch (Exception e) {
            throw new MarvelException(e.getMessage(),e);
        }finally{
            cerrarRecursos(st, rs);
        }
        return lista;
    }

    public Personaje findPersonaje(Personaje personaje) throws MarvelException {
       
        Statement st = null;
        ResultSet rs = null;
        String query = "select * from Personaje where id = '"+personaje.getId()+"'";
        try {
            st = getConexion().createStatement();
            rs=st.executeQuery(query);
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String genero = rs.getString("genero");
            Personaje personajeObtenido = new Personaje(id, nombre, genero,null,null,null);
            return personajeObtenido;
        } catch (Exception e) {
            throw new MarvelException(e.getMessage(),e);
        }finally{
            cerrarRecursos(st, rs);
        }
        
    }

    public boolean updatePersonaje(Personaje personaje) throws MarvelException {
        Set<Personaje>lista = findAllPersonaje();
        if(!lista.contains(personaje)){
            insertarPersonaje(personaje);
            return false;
        }
        String query = "update Personaje set nombre = '"+personaje.getNombre()+"', genero = '"+personaje.getGenero()+"'";
        actualizar(query);
        return true;
    }

    public boolean deletePersonaje(Personaje personaje) throws MarvelException {
        Set<Personaje>lista = findAllPersonaje();
        if(!lista.contains(personaje)){
            return false;
        }
        String query = "delete from Personaje where id='"+personaje.getId()+"'";
        actualizar(query);
        return true;    
    }


    public void cerrarRecursos(Statement st, ResultSet rs){
        try {
            if (!rs.isClosed()) {
                rs.close();
            }
            if (!st.isClosed()) {
                st.close();
            }
            if (!getConexion().isClosed()) {
                getConexion().close();
            }
        } catch (Exception e) {
        }
    }
    private void actualizar(String query) throws MarvelException{
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(),exception);
            
        }finally{
            cerrarRecursos(statement, null);
        }
    }
        public void insertarPersonaje(Personaje personaje) throws MarvelException{
            String query = "insert into Personaje (id,nombre,genero) values"+
            " ('"+personaje.getId()+"', '"+personaje.getNombre()+"', '"+personaje.getGenero()+"')";
            actualizar(query); 
        }

}
