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

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MappersEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.negocio.dto.EquipamientoDTO;
@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoServicio {
    private DaoEquipamiento daoEquipamiento;

    public void setDaoEquipamiento(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }

    public EquipamientoServicio() throws MarvelException {
        daoEquipamiento= new DaoEquipamiento();
    }
    
    @GET
    @Path("/{id}")
    public Response getEquipamientoById(@PathParam("id") String id) throws MarvelException{
        Equipamiento equipamiento= daoEquipamiento.findEquipamiento(new Equipamiento(id));
        if (equipamiento!=null) {
            return Response.ok(MappersEquipamiento.equipamientoToDTO(equipamiento)).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();

    }
    @GET
    @Path("/")
    public Response getEsquipamientos() throws MarvelException{
        Set<Equipamiento> lista = daoEquipamiento.findAllEquipamiento();
        Set<EquipamientoDTO> listaEquipamientoDTOs= new HashSet<>();
        for (Equipamiento equipamiento : lista) {
            EquipamientoDTO equipamientoDTO = MappersEquipamiento.equipamientoToDTO(equipamiento);
            listaEquipamientoDTOs.add(equipamientoDTO);
        }
        return Response.ok(listaEquipamientoDTOs).build();
    }
    @POST
    public Response addEquipamiento(EquipamientoDTO equipamientoDTO) throws MarvelException{
        Equipamiento equipamiento = MappersEquipamiento.DTOToEquipamineto(equipamientoDTO);
        boolean result = daoEquipamiento.updateEquipamiento(equipamiento);
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }
    @DELETE
    public Response deletedEquipamiento(EquipamientoDTO equipamientoDTO ) throws MarvelException{
        Equipamiento equipamiento = MappersEquipamiento.DTOToEquipamineto(equipamientoDTO);
        boolean result = daoEquipamiento.deleteEquipamiento(equipamiento);
        if (result) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
