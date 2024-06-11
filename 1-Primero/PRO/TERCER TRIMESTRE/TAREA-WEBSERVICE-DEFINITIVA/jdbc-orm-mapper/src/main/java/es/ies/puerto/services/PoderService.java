package es.ies.puerto.services;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/poder")
@Consumes("application/json")
@Produces("application/json")
public class PoderService {
    private DaoPoder daoPoder;

    public PoderService() throws MarvelException {
        daoPoder = new DaoPoder();
    }

    public PoderService(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/poder/{id}")
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        PoderDTO poderDTO = IMapperPoder.INSTANCE.poderToPoderDTO(daoPoder.findPoder(new Poder(id)));

        if (poderDTO != null) {
            return Response.ok(poderDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/poder/")
    public Response getAll() throws MarvelException {
        Set<PoderDTO> poderList = new HashSet<>();
        for (Poder poderDb : daoPoder.findAllPoder()){
            poderList.add(IMapperPoder.INSTANCE.poderToPoderDTO(poderDb));
        }
        return Response.ok(poderList).build();
    }

    @POST
    public Response addObject(PoderDTO poderDTO) throws MarvelException {
        Poder poder = IMapperPoder.INSTANCE.poderDTOToPoder(poderDTO);
        boolean resultado = daoPoder.updatePoder((poder));
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/poder/{id}")
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        Poder poder = IMapperPoder.INSTANCE.poderDTOToPoder(new PoderDTO(id));
        boolean deleted = daoPoder.deletePoder(poder);

        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/poder/xml/{id}")
    @Produces("application/xml")
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Poder poder = IMapperPoder.INSTANCE.poderDTOToPoder(new PoderDTO(id));
        Poder poderFind = daoPoder.findPoder(poder);
        if (poderFind != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
