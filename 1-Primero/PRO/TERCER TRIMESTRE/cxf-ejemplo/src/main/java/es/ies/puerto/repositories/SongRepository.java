package es.ies.puerto.repositories;

import es.ies.puerto.model.SongDTO;

public class SongRepository {
    public SongDTO getSongById(String id) {
        return new SongDTO(id, "Karma Police","4.00");
    }
}
