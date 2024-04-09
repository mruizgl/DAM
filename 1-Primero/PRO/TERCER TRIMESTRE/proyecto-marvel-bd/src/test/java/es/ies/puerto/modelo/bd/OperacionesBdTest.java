package es.ies.puerto.modelo.bd;

import es.ies.puerto.Personaje;
import es.ies.puerto.Poder;
import es.ies.puerto.db.OperacionesBd;
import es.ies.puerto.exception.PersonajeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Personaje personaje;
    List<Poder> poderes = new ArrayList<>();
    @BeforeEach
    public void beforeEach() {
        try {
            Poder poder = new Poder("maquina");
            poderes.add(poder);
            personaje = new Personaje("11","pepe","hombre",poderes);
            operacionesBd = new OperacionesBd(urlBd);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerPersonajeAllTest() {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail(e.getMessage());
        }
    }


}
