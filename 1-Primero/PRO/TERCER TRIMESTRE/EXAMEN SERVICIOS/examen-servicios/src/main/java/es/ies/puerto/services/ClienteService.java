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
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.mapper.ClienteMapper;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.impl.ClienteDAO;

@Path("/Cliente")
@Consumes("application/json")
@Produces("application/json")
public class ClienteService {
    private ClienteDAO clienteDAO;

    public void setClienteDAO(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    public ClienteService () throws TiendaException{
        clienteDAO = new ClienteDAO();
    }

    @GET
    @Path("{/id}")
    public Response getClieentebyId(@PathParam("id")int id) throws TiendaException{
        ClienteEntity clienteEntity = clienteDAO.findById(new ClienteEntity(id));
        if (clienteEntity!=null) {
            return Response.ok(ClienteMapper.toDTO(clienteEntity)).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    @GET
    @Path("/")
    public Response getAllclientes() throws TiendaException{
        Set<ClienteEntity> lista = clienteDAO.findAll();
        Set<ClienteDTO> clientes = new HashSet<>();
        for (ClienteEntity cliente : lista) {
            clientes.add(ClienteMapper.toDTO(cliente));
        }
        return Response.ok(clientes).build();
    }
    @POST
    public Response save(ClienteDTO clienteDTO) throws TiendaException{
        ClienteEntity clienteEntity = ClienteMapper.toEntity(clienteDTO);
        boolean result = clienteDAO.update(clienteEntity);
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }


    @DELETE
    public Response delete (ClienteDTO clienteDTO) throws TiendaException{
        ClienteEntity clienteEntity = ClienteMapper.toEntity(clienteDTO);
        boolean result = clienteDAO.delete(clienteEntity);
        if (result) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
