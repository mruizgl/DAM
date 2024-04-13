import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class HeroesTest {
    private Heroes heroes;
    private ArrayList<String> poderes;


    @BeforeEach
    public void beforeAll () {
        heroes = new Heroes();
        poderes = new ArrayList<>();
        poderes.add("Armadura");
        Personaje personaje = new Personaje("Tony", "Iron Man", "Hombre", poderes);
        heroes.addHeroe(personaje);
    }

    @Test
    public void addHeroeTest () {
        Personaje personaje = new Personaje("sdfg", "dfg Man", "df", poderes);
        heroes.addHeroe(personaje);
        Assertions.assertEquals(heroes.getPersonajes().size(), 2);
        Assertions.assertEquals(heroes.getPersonajes().get(1).getNombre(), "sdfg");
    }

    @Test
    public void updateHeroeTest () {
        Personaje personaje = new Personaje("Tony", "test", "test", poderes);
        System.out.println(heroes.getPersonajes().size());
        heroes.updateHeroe(personaje);
        Assertions.assertEquals(heroes.getPersonajes().get(0).getNombre(), "Tony");
        Assertions.assertEquals(heroes.getPersonajes().get(0).getAlias(), "test");
        Assertions.assertEquals(heroes.getPersonajes().get(0).getGenero(), "test");

    }

    @Test
    public void deleteHeroeTest () {
        Personaje personaje = new Personaje("Tony");
        heroes.deleteHeroe(personaje);
        Assertions.assertEquals(heroes.getPersonajes().size(), 0);
    }


}
