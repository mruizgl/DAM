package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoEquipamiento  extends Conexion{


    public DaoEquipamiento() throws MarvelException {
        super();
    }

    public Set<Equipamiento> findAllEquipamiento() throws MarvelException {
        Set<Equipamiento>lista = new HashSet<>();
        Statement st = null;
        ResultSet rs = null;
        String query = "select * from Equipamiento";
        try {
            st=getConexion().createStatement();
            rs=st.executeQuery(query);
            while(rs.next()){
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String isPersonaje = rs.getString("personaje_id");
                Equipamiento equip = new Equipamiento(id, nombre, descripcion, isPersonaje);
                lista.add(equip);
            }
        } catch (Exception e) {
            throw new MarvelException(e.getMessage(),e);
        }finally{
            cerrarRecursos(st, rs);
        }

        return lista;
    }

    public Equipamiento findEquipamiento(Equipamiento equipamiento) throws MarvelException {
        
        Statement st = null;
        ResultSet rs = null;
        String query = "select * from Equipamiento where id = '"+equipamiento.getId()+"'";
        try {
            st=getConexion().createStatement();
            rs=st.executeQuery(query);
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String isPersonaje = rs.getString("personaje_id");
                Equipamiento equip = new Equipamiento(id, nombre, descripcion, isPersonaje);
               return equip;
        } catch (Exception e) {
            throw new MarvelException(e.getMessage(),e);
        }finally{
            cerrarRecursos(st, rs);
        }
    }

    public boolean updateEquipamiento(Equipamiento equipamiento) throws MarvelException {
        Set<Equipamiento>lista = findAllEquipamiento();
        if(!lista.contains(equipamiento)){
            insertarEquipamiento(equipamiento);
            return false;
        }
        String query = "update Equipamiento"+ 
        " set nombre= '"+equipamiento.getNombre()+"', descripcion = '"+equipamiento.getDescripcion()+"', personaje_id = '"+equipamiento.getPersonaje_id()+"'"+
        " where id = '"+equipamiento.getId()+"'";
        actualizar(query);
        return true;
    }

    public boolean deleteEquipamiento(Equipamiento equipamiento) throws MarvelException {
        Set<Equipamiento>lista = findAllEquipamiento();
        if(!lista.contains(equipamiento)){
            return false ;
        }
        String query = "delete from Equipamiento where id = '"+equipamiento.getId()+"'";
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
    public void insertarEquipamiento (Equipamiento equipamiento) throws MarvelException{
        String query ="insert into Equipamiento (id, nombre,descripcion, personaje_id)"+
        " values ('"+equipamiento.getId()+"', '"+equipamiento.getNombre()+"', '"+equipamiento.getDescripcion()+"', '"+equipamiento.getPersonaje_id()+"')";
        actualizar(query);
    }
}
