package es.ies.puerto.services;

import es.ies.puerto.model.SongDTO;
import es.ies.puerto.repositories.SongRepository;

import javax.ws.rs.*;

@Path("/songs")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class SongService {
    private SongRepository songRepository = new SongRepository();
    public SongService() {
        songRepository = new SongRepository();
    }

    @GET
    @Path("/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public SongDTO getSongById(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }
}
