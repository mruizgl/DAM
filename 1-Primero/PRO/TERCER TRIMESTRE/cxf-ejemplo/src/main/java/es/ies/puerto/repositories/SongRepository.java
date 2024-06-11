package es.ies.puerto.repositories;

import es.ies.puerto.model.SongDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

public class SongRepository {

    private  List<SongDTO> lista;

    public SongRepository() {
        lista = new ArrayList<>();
        lista.add(new SongDTO("1", "Karma POlice", "4.00"));
        lista.add(new SongDTO("2", "Pepe Benavente", "4.00") );
    }
    public SongDTO getSongById(String id) {
        return lista.get(Integer.getInteger(id));
    }

    public void saveSong (SongDTO songDTO) {
        if (lista.contains(songDTO)) {

        }
        lista.add(songDTO);
    }


    @GET
    @Path("/")
    @Consumes("application/xml")
    @Produces("application/xml")
    public List<SongDTO> getSongs() {
        List<SongDTO> lista = new ArrayList<>();

        lista.add(new SongDTO("1", "Karma POlice", "4.00"));
        lista.add(new SongDTO("2", "Pepe Benavente", "4.00") );
        return lista;
    }


}
