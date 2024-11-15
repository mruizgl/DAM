package es.ies.puerto.services;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperEquipamiento;

import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;


@Path("/equipamiento")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoService {
    private DaoEquipamiento daoEquipamiento;


    public EquipamientoService() throws MarvelException {
        daoEquipamiento = new DaoEquipamiento();
    }

    public EquipamientoService(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }

    @GET
    @Path("/{id}")
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        EquipamientoDTO equipamientoDTO = IMapperEquipamiento.INSTANCE.
                equipamientoToEquipamientoDTO(daoEquipamiento.findEquipamiento(new Equipamiento(id)));
        if (equipamientoDTO != null) {
            return Response.ok(equipamientoDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    public Response getAll() throws MarvelException {
        Set<EquipamientoDTO> list = new HashSet<>();
        for (Equipamiento equipamientodb : daoEquipamiento.findAllEquipamiento()){
            list.add(IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(equipamientodb));
        }
        return Response.ok(list).build();
    }

    @POST
    public Response addObject(EquipamientoDTO equipamientoDTO) throws MarvelException {
        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO);
        boolean resultado = daoEquipamiento.updateEquipamiento(equipamiento);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.
                equipamientoDTOToEquipamiento(new EquipamientoDTO(id));

        boolean deleted = daoEquipamiento.deleteEquipamiento(equipamiento);
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.
                equipamientoDTOToEquipamiento(new EquipamientoDTO(id));

        Equipamiento equipamientoFind = daoEquipamiento.findEquipamiento(equipamiento);
        if (equipamientoFind  != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
