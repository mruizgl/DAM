package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaoPoder  extends Conexion{
    public DaoPoder()throws MarvelException{
        super();
    }
    

    public Set<Poder> findAllPoder() throws MarvelException {
        Set<Poder>poderes= new HashSet<>();
        String query = "Select * from Poder";
        Statement st = null;
        ResultSet rs= null;  
        try {
            st=getConexion().createStatement();
            rs=st.executeQuery(query);
            while(rs.next()){
                String id= rs.getString("id");
                String nombre = rs.getString("nombre");
                Poder poder = new Poder(id, nombre);
                poderes.add(poder);
            }
        } catch (SQLException e) {
            throw new MarvelException(e.getMessage(),e);
        }finally{
            cerrarRecursos(st, rs);
        }     
        return poderes;
    }

    public Poder findPoder(Poder poder) throws MarvelException {
        
        String query= "Select * from poder where id = '"+poder.getId()+"'";
        Statement st=null;
        ResultSet rs = null;
     
        try {
            st=getConexion().createStatement();
            rs=st.executeQuery(query);
            String id = rs.getString("id");
            String nombre = rs.getString("nombre");
            Poder poderObtenido = new Poder(id,nombre);
            return poderObtenido;
        } catch (Exception e) {
            throw new MarvelException(e.getMessage(),e);
        }finally{
            cerrarRecursos(st, rs);
        }
        
    }

    public boolean updatePoder(Poder poder) throws MarvelException {
        Set<Poder>lista= findAllPoder();
        if (!lista.contains(poder)) {
            insertarPoder(poder);
            return false;
        }
        String query = "update Poder set nombre= '"+poder.getNombre()+"' where id = '"+poder.getId()+"'";
        actualizar(query);
        return true;
    }

    public boolean deletePoder(Poder poder) throws MarvelException {
        Set<Poder>lista= findAllPoder();
        if (!lista.contains(poder)) {
            return false ;
        }
        String query = "delete from Poder where id = '"+poder.getId()+"'";
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
    public void insertarPoder(Poder poder) throws MarvelException{
        String query = "insert into Poder (id,nombre) values ('"+poder.getId()+"','"+poder.getNombre()+"')";
        actualizar(query);
;    }
}

