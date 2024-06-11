package es.ies.puerto.servicio;

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

import org.hibernate.mapping.List;
import org.mapstruct.Mapper;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MappersPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.negocio.dto.PoderDTO;
@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class PoderServicio {
    private DaoPoder daoPoder;

    
    public void setDaoPoder(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    public PoderServicio () throws MarvelException{
        daoPoder = new DaoPoder();
    }

    @GET
    @Path("/{id}")
    public Response getPoderById(@PathParam("id")String id) throws MarvelException{
        Poder  poder= daoPoder.findPoder(new Poder(id));
        if (poder != null) {
            return Response.ok(MappersPoder.poderTopoderDTO(poder)).build();
        }   
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    @GET
    @Path("/")
    public Response getPoderes() throws MarvelException{
        Set<Poder>lista = daoPoder.findAllPoder();
        Set<PoderDTO>poderes= new HashSet<>();
        for (Poder poder : lista) {
            PoderDTO poderDTO = MappersPoder.poderTopoderDTO(poder);
            poderes.add(poderDTO);
        }
        return Response.ok(poderes).build();
    }
    @POST
    public Response addPoder(PoderDTO poderDTO) throws MarvelException{
        Poder poder=MappersPoder.poderDTOTopoder(poderDTO);
        boolean result= daoPoder.updatePoder(poder);
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
        }
    @DELETE
    @Path("/{id}")
    public Response deletePoder(@PathParam("id")String id) throws MarvelException{
        boolean deleted = daoPoder.deletePoder(new Poder(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
