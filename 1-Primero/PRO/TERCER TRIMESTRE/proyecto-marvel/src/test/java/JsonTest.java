import es.ies.puerto.modelo.ficheros.FileCsv;
import es.ies.puerto.modelo.ficheros.FileJson;
import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.interfaces.IOperacionesFichero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JsonTest {

    @Test
    public void saveJson () {
        IOperacionesFichero fileJson = new FileJson();
        Heroes heroes = new Heroes();
        ArrayList<String> poderes = new ArrayList<>();
        poderes.add("poder test");
        poderes.add("impactrueno");
        Personaje personaje1 = new Personaje("Prueba", "Pruebaapellido", "NS", poderes);
        Personaje personaje2 = new Personaje("sad", "djs", "genero", poderes);
        heroes.addHeroe(personaje1);
        heroes.addHeroe(personaje2);
        fileJson.saveToFile("src/test/resources/heroesTest2.json", heroes);
    }

    @Test
    public void readJson () {
        IOperacionesFichero fileJson = new FileJson();
        Heroes heroes = fileJson.readFromFile("src/test/resources/heroesTest.json");
        Assertions.assertEquals(heroes.getPersonajes().size(), 2, "El resultado no es el esperado");
    }
}
