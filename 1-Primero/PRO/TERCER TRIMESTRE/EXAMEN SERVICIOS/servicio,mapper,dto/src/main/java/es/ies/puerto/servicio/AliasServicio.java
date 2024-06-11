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
import javax.xml.ws.soap.AddressingFeature.Responses;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperAlias;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.negocio.dto.AliasDTO;
@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class AliasServicio {
    private DaoAlias daoAlias;

    public void setDaoAlias(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }
    public AliasServicio() throws MarvelException{
        daoAlias = new DaoAlias();
    }
    @GET
    @Path("/{id}")
    public Response getAliasById(@PathParam("id")String id) throws MarvelException{
        Alias alias = daoAlias.findAlias(new Alias(id));
        if (alias !=null) {
            return Response.ok(MapperAlias.aliasToAliasDTO(alias)).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    @GET
    @Path("/")
    public Response getAlias() throws MarvelException{
        Set<Alias> lista = daoAlias.findAllAlias();
        Set<AliasDTO> aliasLista= new HashSet<>();
        for (Alias alias : lista) {
            AliasDTO aliasDTO = MapperAlias.aliasToAliasDTO(alias);
            aliasLista.add(aliasDTO);
        }
        return Response.ok(aliasLista).build();
    }
    @POST
    public Response addAlias(AliasDTO aliasDTO) throws MarvelException{
        Alias alias = MapperAlias.DTOtoAlias(aliasDTO);
        boolean result = daoAlias.updateAlias(alias);
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }
    @DELETE
    public Response deleteAlias(AliasDTO aliasDTO ) throws MarvelException{
        Alias alias = MapperAlias.DTOtoAlias(aliasDTO);
        boolean result = daoAlias.deleteAlias(alias);
        if (result) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
