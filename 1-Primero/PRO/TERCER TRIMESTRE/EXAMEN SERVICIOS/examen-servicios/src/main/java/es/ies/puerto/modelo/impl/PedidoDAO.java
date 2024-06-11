package es.ies.puerto.modelo.impl;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PedidoDAO  extends Conexion{
    public PedidoDAO() throws TiendaException {
        super();
    }

    public PedidoEntity findById(PedidoEntity pedidoEntity) throws TiendaException{
        if (pedidoEntity==null) {
            return null;
        }
        String query = "select * from Pedido where id= "+pedidoEntity.getId()+"";
        Set<PedidoEntity>lista = obtener(query);
        return lista.iterator().next();
    }
    public Set<PedidoEntity> findAll() throws TiendaException{
        String query = "select * from Pedido";
        return obtener(query);
    }
    public void save(PedidoEntity pedidoEntity) throws TiendaException{
        String query = "insert into Pedido values("+pedidoEntity.getId()+","+pedidoEntity.getClienteId()+", '"+pedidoEntity.getProducto()+"',"+pedidoEntity.getCantidad()+")";
        actualizar(query);
        
    }
    public boolean update(PedidoEntity pedidoEntity) throws TiendaException{
        Set<PedidoEntity> lista = findAll();
        if (!findAll().contains(pedidoEntity)) {
            save(pedidoEntity);
            return false;
        }
        String query ="update Pedido set producto= '"+pedidoEntity.getProducto()+"',cantidad = "+pedidoEntity.getCantidad()+""+
        " where id = "+pedidoEntity.getId()+"";
        actualizar(query);
        return true;
    }
    public boolean delete(PedidoEntity pedidoEntity) throws TiendaException{
        Set<PedidoEntity> lista = findAll();
        if (!findAll().contains(pedidoEntity)) {
            return false;
        }
        String query = "delete from Pedido where id = "+pedidoEntity.getId()+"";
        actualizar(query);
        return true;
    }

    private Set<PedidoEntity> obtener(String query) throws TiendaException{
        Set<PedidoEntity>lista = new HashSet<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = getConexion().createStatement();
            rs=st.executeQuery(query);
            while (rs.next()) {
                int id= rs.getInt("id");
                int idCliente = rs.getInt("clienteId");
                String producto  = rs.getString("producto");
                int cantidad = rs.getInt("cantidad");
                PedidoEntity pedidoEntity  =new PedidoEntity(id, idCliente, producto, cantidad);
                lista.add(pedidoEntity);
            }
        } catch (Exception e) {
            throw new  TiendaException(e.getMessage(),e);
        }finally{
            cerrarRecursos(rs, st);
        }
        return lista;
    }
    
}
