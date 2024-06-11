package es.ies.puerto.services;

import es.ies.puerto.model.SongDTO;
import es.ies.puerto.repositories.SongRepository;

import javax.ws.rs.*;
import java.util.List;

@Path("/")
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

    @GET
    @Path("/xml/{id}")
    @Consumes({"application/xml"})
    @Produces({"application/xml"})
    public SongDTO getSongByIdXml(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }

    @GET
    @Path("/")
    @Consumes({"application/xml"})
    @Produces({"application/xml"})
    public List<SongDTO> getSongs() {
        return songRepository.getSongs();
    }

    @POST
    @Path("/{song}")
    @Consumes({"application/xml"})
    public void addSong(SongDTO songDTO) {
        songRepository.saveSong(songDTO);
    }

    public static void main(String[] args) {
        int numero = 1234;
        int resultado = 0;
        String numeroString = Integer.toString(numero);
        for (int i = numeroString.length()-1; i >= 0; i--) {

        }
      

    }

}
