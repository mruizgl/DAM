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
import es.ies.puerto.mappers.classic.MappersPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.negocio.dto.PersonajeDTO;

@Path("/Personajes")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeServicio {

    private DaoPersonaje daoPersonaje;

    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    public PersonajeServicio() throws MarvelException {
        daoPersonaje= new DaoPersonaje();
    }
    @GET
    @Path("/{id}")
    public Response getPErsonateById(@PathParam("id")String id ) throws MarvelException{
        Personaje personaje = daoPersonaje.findPersonaje(new Personaje(id));
        if (personaje!=null) {
            return Response.ok(MappersPersonaje.personajeToDTO(personaje)).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
    @GET
    @Path("/")
    public Response getPersonajes() throws MarvelException{
        Set<PersonajeDTO> listaPersonajes = new HashSet<>();
        Set<Personaje> lista = daoPersonaje.findAllPersonaje();
        for (Personaje personaje : lista) {
            PersonajeDTO personajeDTO = MappersPersonaje.personajeToDTO(personaje);
        }
        return Response.ok(listaPersonajes).build();
    }
    @POST
    public Response addPersonaje(PersonajeDTO personajeDTO) throws MarvelException{
        Personaje personaje = MappersPersonaje.DTOtoPersonaje(personajeDTO);
        boolean result = daoPersonaje.updatePersonaje(personaje);
        if (result) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }
    @DELETE
    public Response deletePersonaje(PersonajeDTO personajeDTO) throws MarvelException{
        Personaje personaje = MappersPersonaje.DTOtoPersonaje(personajeDTO);
        boolean result = daoPersonaje.deletePersonaje(personaje);
        if (result) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
