import es.ies.puerto.modelo.ficheros.FileJson;
import es.ies.puerto.modelo.ficheros.FileXml;
import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.interfaces.IOperacionesFichero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class XmlTest {

    @Test
    public void xmlSaveTest () {
        IOperacionesFichero fileXml = new FileXml();
        Heroes heroes = new Heroes();
        Personaje personaje1 = new Personaje("Prueba", "Pruebaapellido", "NS", null);
        Personaje personaje2 = new Personaje("sad", "djs", "genero", null);
        heroes.addHeroe(personaje1);
        heroes.addHeroe(personaje2);
        fileXml.saveToFile("src/test/resources/heroesTest2.xml", heroes);
    }

    @Test
    public void xmlReadTest () {
        IOperacionesFichero fileXml = new FileXml();
        Heroes heroes = fileXml.readFromFile("src/test/resources/heroesTest.xml");
        Assertions.assertEquals(heroes.getPersonajes().size(), 2, "El resultado no es el esperado");
    }
}
