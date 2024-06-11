package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Alias;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class DaoAlias  extends Conexion{


    public DaoAlias() throws MarvelException {
          super();
        }

        public Set<Alias> findAllAlias() throws MarvelException {
            Set<Alias>lista = new HashSet<>();
            Statement st = null;
            ResultSet rs = null;
            String query  = "select * from Alias";
            try {
                st = getConexion().createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    String id = rs.getString("id");
                    String idPersonaje = rs.getString("personaje_id");
                    String descripcion= rs.getString("alias"); 
                    Alias alias = new Alias(id, descripcion, idPersonaje);
                    lista.add(alias);
                }
            } catch (Exception e) {
               throw new MarvelException(e.getMessage(),e);

            }finally{
                cerrarRecursos(st, rs);
            }
            
            
            return lista;
        }

        public Alias findAlias(Alias alias) throws MarvelException {
            
            String query = "select * from Alias where id = '"+alias.getId()+"'";
            Statement st = null;
            ResultSet rs = null;
            try {
                st = getConexion().createStatement();
                rs = st.executeQuery(query);
                    String id = rs.getString("id");
                    String idPersonaje = rs.getString("personaje_id");
                    String descripcion= rs.getString("alias"); 
                    Alias aliasobtenido = new Alias(id, descripcion, idPersonaje);
                    return aliasobtenido;
            } catch (Exception e) {
               throw new MarvelException(e.getMessage(),e);

            }finally{
                cerrarRecursos(st, rs);
            }
            
        }

        public boolean updateAlias(Alias alias) throws MarvelException {
            Set<Alias>lista = findAllAlias();
            if(!lista.contains(alias)){
                insertarAlias(alias);
                return false;

            }
            String query = "update Alias set alias= '"+alias.getDescripcion()+"' where id = '"+alias.getId()+"'";
            actualizar(query);
            return true;
        }

        public boolean deleteAlias(Alias alias) throws MarvelException {
            Set<Alias>lista = findAllAlias();
            if(!lista.contains(alias)){
                return false ;
            }
            String query = "delete from Alias where id ='"+alias.getId()+"'";
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
        public void insertarAlias (Alias alias) throws MarvelException{
            String query = "insert into Alias (id ,alias, personaje_id) values"+
            " ('"+alias.getId()+"', '"+alias.getDescripcion()+"', '"+alias.getPersonaje_id()+"')"; 
            actualizar(query);
        }

}
