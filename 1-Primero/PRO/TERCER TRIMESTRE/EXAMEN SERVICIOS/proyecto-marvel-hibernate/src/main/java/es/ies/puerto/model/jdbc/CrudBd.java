package es.ies.puerto.model.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.excepcion.UsuarioExcepcion;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.Personaje;
import es.ies.puerto.model.impl.Poder;



public class CrudBd extends Conexion {

    public CrudBd() throws UsuarioExcepcion {
        super();
    }

    public void cerrar(Statement statement,ResultSet resultSet)throws UsuarioExcepcion{
        try {

            if (resultSet!=null && !resultSet.isClosed()) {
                resultSet.close();
            }
            if (statement!=null && !statement.isClosed()) {
                statement.close();
            }
            if (getConnection()!=null && !getConnection().isClosed()) {
                getConnection().close();
            }

        } catch (Exception p) {
            throw new UsuarioExcepcion(p.getMessage(), p);
        }

    }

    public int obtenerIdPersonaje(Personaje personaje)throws UsuarioExcepcion{
        Statement statement = null;
        ResultSet resultSet = null;
        int personajeId=-1;
        try {
            statement=getConnection().createStatement();
            resultSet =statement.executeQuery("SELECT id FROM PERSONAJES WHERE nombre='"+personaje.getNombre()+"'");
            while (resultSet.next()) {
                personajeId = resultSet.getInt("id");
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement,resultSet);
        }
        return personajeId;
    }

    public int obtenerIdPoder(Poder poder)throws UsuarioExcepcion{
        Statement statement = null;
        ResultSet resultSet = null;
        int poderId=-1;
        try {
            statement=getConnection().createStatement();
            resultSet =statement.executeQuery("SELECT id FROM Poderes WHERE poder='"+poder.getPoder()+"'");
            while (resultSet.next()) {
                poderId = resultSet.getInt("id");
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement,resultSet);
        }
        return poderId;
    }

    public int obtenerIdAlias(Alias alias)throws UsuarioExcepcion{
        Statement statement = null;
        ResultSet resultSet = null;
        int poderId=-1;
        try {
            statement=getConnection().createStatement();
            resultSet =statement.executeQuery("SELECT id " +
                    "FROM Alias " +
                    "WHERE alias='"+alias.getAlias()+"'");
            while (resultSet.next()) {
                poderId = resultSet.getInt("id");
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement,resultSet);
        }
        return poderId;
    }

    public void ejecutar(String sql)throws UsuarioExcepcion{
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement, null);
        }
    }


    public Alias obtenerAlias(Integer idPersonaje) throws UsuarioExcepcion{
        Statement statement = null;
        ResultSet resultSet = null;

        Alias alias = new Alias();
        try {
            statement=getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT a.id,a.alias " +
                    "FROM Alias as a " +
                    "WHERE a.personaje_id="+idPersonaje);
            while (resultSet.next()) {
                alias.setId(resultSet.getInt("id"));
                alias.setAlias(resultSet.getString("alias"));
                alias.setPersonaje(new Personaje(idPersonaje));
                return alias;
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement, resultSet);
        }

        return alias;
    }


    public Set<Poder> obtenerPoderes(Integer idPersonaje)throws UsuarioExcepcion{
        Statement statement = null;
        ResultSet resultSet = null;
        Set<Poder> poderes = new HashSet<>();
        try {
            statement=getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT p.id, p.poder FROM Poderes as p JOIN Personajes_Poderes as pp ON p.id=pp.poder_id WHERE pp.personaje_id="+idPersonaje);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String poder = resultSet.getString("poder");
                poderes.add(new Poder(id, poder, null));
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement, resultSet);
        }

        return poderes;
    }


    public Personaje obtenerPersonaje(Personaje personaje) throws UsuarioExcepcion {
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement=getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT id,genero,nombre " +
                    "FROM Personajes WHERE id="+personaje.getId());
            Integer id = resultSet.getInt("id");
            String genero = resultSet.getString("genero");
            String nombre = resultSet.getString("nombre");
            Set<Poder> poderes = obtenerPoderes(id);
            Alias alias = obtenerAlias(id);
            personaje = new Personaje(id, nombre, alias, genero, poderes);
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement, resultSet);
        }
        return personaje;
    }


    public Set<Personaje> obtenerPersonajes() throws UsuarioExcepcion {
        ResultSet resultSet = null;
        Statement statement = null;
        Set<Personaje> personajes = new HashSet<>();
        try {
            statement=getConnection().createStatement();
            resultSet = statement.executeQuery("SELECT id,genero,nombre FROM personajes");
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String genero = resultSet.getString("genero");
                String nombre = resultSet.getString("nombre");
                Set<Poder> poderes = obtenerPoderes(id);
                Alias alias = obtenerAlias(id);
                personajes.add(new Personaje(id, nombre, alias, genero, poderes));
            }
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }finally{
            cerrar(statement, resultSet);
        }

        return personajes;
    }


    public void eliminarPersonaje(Personaje personaje) throws UsuarioExcepcion {
        try {
            String poderesPersonajesQuerry="DELETE FROM Personajes_Poderes WHERE personaje_id="+personaje.getId();
            ejecutar(poderesPersonajesQuerry);
            String aliasQuerry = "DELETE FROM Alias WHERE personaje_id="+personaje.getId();
            ejecutar(aliasQuerry);
            String querry = "DELETE FROM Personajes WHERE id="+personaje.getId();
            ejecutar(querry);
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }
    }


    public void actualizarPersonaje(Personaje personaje) throws UsuarioExcepcion {
        try {
            String actualizarPersonajes = "UPDATE Personajes SET nombre='"+personaje.getNombre()+"', genero='"+personaje.getGenero()+"' WHERE id="+personaje.getId();
            ejecutar(actualizarPersonajes);
            for (Poder poder : personaje.getPoderes()) {
                String actualizarPoder = "UPDATE Poderes SET poder='"+poder.getPoder()+"' WHERE id="+poder.getId();
                ejecutar(actualizarPoder);
            }
            String actualizarAlias = "UPDATE Alias SET alias='"+personaje.getAlias().getAlias()+"' WHERE id="+personaje.getAlias().getId();
            ejecutar(actualizarAlias);
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }

    }

    public void agregarPersonaje(Personaje personaje) throws UsuarioExcepcion {
        if (obtenerPersonajes().contains(personaje)) {
            return;
        }
        String querry = "INSERT INTO Personajes (nombre,genero) VALUES ('"+personaje.getNombre()+"','"+personaje.getGenero()+"')";
        try {
            ejecutar(querry);
            int personajeId = obtenerIdPersonaje(personaje);
            personaje.setId(personajeId);
            for (Poder poder : personaje.getPoderes()) {
                String poderQuerry = "INSERT INTO Poderes (poder) VALUES ('"+poder.getPoder()+"')";
                ejecutar(poderQuerry);
                int poderId = obtenerIdPoder(poder);
                poder.setId(poderId);
                String poderesPersonajesQuerry="INSERT INTO Personajes_Poderes (personaje_id,poder_id) VALUES ("+personajeId+","+poderId+")";
                ejecutar(poderesPersonajesQuerry);
            }
            Alias aliasPersonaje = personaje.getAlias();
            String aliasQuerry = "INSERT INTO Alias (personaje_id,alias) VALUES ("+personajeId+",'"+aliasPersonaje.getAlias()+"')";
            ejecutar(aliasQuerry);
            int aliasId = obtenerIdAlias(aliasPersonaje);
            personaje.getAlias().setId(aliasId);
        } catch (Exception e) {
            throw new UsuarioExcepcion(e.getMessage(), e);
        }

    }
}
