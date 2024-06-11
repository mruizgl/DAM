package es.ies.puerto.modelo.impl;

import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.entity.ClienteEntity;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClienteDAO  extends Conexion{
    public ClienteDAO() throws TiendaException {
        super();
    }
    
    public ClienteEntity findById(ClienteEntity clienteEntity) throws TiendaException{
        if (clienteEntity==null) {
            return null;
        }
        String query = "select * from Cliente where id = "+clienteEntity.getId()+"";
        Set<ClienteEntity> lista = obtener(query);
        return lista.iterator().next();
    }

    public Set<ClienteEntity> findAll() throws TiendaException{
        String query = "Select * from Cliente";
        Set<ClienteEntity> lista = obtener(query);
        return lista;
    }

   
    public void save(ClienteEntity clienteEntity) throws TiendaException{
        
        String query ="insert into Cliente values ("+clienteEntity.getId()+",'"+clienteEntity.getNombre()+"', '"+clienteEntity.getEmail()+"')";
        actualizar(query);
    }


    public Boolean update(ClienteEntity clienteEntity) throws TiendaException{
        Set<ClienteEntity>lista = findAll();
        if (!lista.contains(clienteEntity)) {
            save(clienteEntity);
            return false;
        }
        String query = "update Cliente  set nombre = '"+clienteEntity.getNombre()+"', email ='"+clienteEntity.getEmail()+"'"+
        " where id = "+clienteEntity.getId()+"";
        actualizar(query);
        return true;
    }

    
    
    public boolean delete(ClienteEntity clienteEntity) throws TiendaException{
        Set<ClienteEntity>lista = findAll();
        if (!lista.contains(clienteEntity)) {
            return false;
        }
        String query = "delete from Cliente where id = "+clienteEntity.getId()+"";
        borrerPedidosCliente(clienteEntity);
        actualizar(query);
        return true;
    }

    private Set<ClienteEntity> obtener(String query) throws TiendaException{
        Set<ClienteEntity> lista = new HashSet<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st= getConexion().createStatement();
            rs= st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                ClienteEntity clienteEntity = new ClienteEntity(id, nombre, email);
                lista.add(clienteEntity);
            }
        } catch (Exception e) {
            throw new TiendaException(e.getMessage(),e);
        }finally{
            cerrarRecursos(rs, st);
        }
        return lista;
    }
    boolean borrerPedidosCliente(ClienteEntity clienteEntity) throws TiendaException{
        if (clienteEntity==null) {
            return false;
        }
        String query = "delete from Pedido where clienteId = "+clienteEntity.getId()+"";
        actualizar(query);
        return true;
    }
}
