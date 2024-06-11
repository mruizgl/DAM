package es.ies.puerto.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.mapper.PedidoMapper;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.modelo.impl.PedidoDAO;

@Path("/Pedidos")
@Consumes("application/json")
@Produces("applicatopn/json")
public class PedidoService {

    private PedidoDAO pedidoDAO;

    public void setPedidoDAO(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }
    public PedidoService() throws TiendaException{
        pedidoDAO= new PedidoDAO();
    }

    @GET
    @Path("/{id}")
    public Response getPedidoById(@PathParam("id")int id) throws TiendaException{
        PedidoEntity pedidoEntity = pedidoDAO.findById(new PedidoEntity(id));
        if (pedidoEntity!=null) {
            return Response.ok(PedidoMapper.toDTO(pedidoEntity)).build();

        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    @GET
    @Path("/")
    public Response getAllPedidos() throws TiendaException{
        Set<PedidoDTO> pedidos = new HashSet<>();
        Set<PedidoEntity> lista = pedidoDAO.findAll();
        for (PedidoEntity pedidoEntity : lista) {
            pedidos.add(PedidoMapper.toDTO(pedidoEntity));
        }
        return Response.ok(pedidos).build();
    }

    @POST
    public Response save(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException{
        PedidoEntity pedidoEntity = PedidoMapper.toEntity(pedidoDTO, clienteDTO);
        boolean result = pedidoDAO.update(pedidoEntity);
        if (result) {
            return Response.status(Response.Status.OK).build();
        }   
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
   public Response delete (PedidoDTO  pedidoDTO ,ClienteDTO clienteDTO) throws TiendaException{
        PedidoEntity pedidoEntity = PedidoMapper.toEntity(pedidoDTO, clienteDTO);
        boolean result = pedidoDAO.delete(pedidoEntity);
        if (result) {
            return Response.status(Response.Status.NO_CONTENT).build();

        }
        return Response.status(Response.Status.NO_CONTENT).build();
    }  
} 
