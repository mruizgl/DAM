package es.ies.puerto.modelo.ficheros;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.PersonajeList;
import es.ies.puerto.modelo.interfaces.IOperacionesFichero;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileXml implements IOperacionesFichero {
    @Override
    public Heroes readFromFile(String path) {
        Heroes heroes;
        Persister persister = new Persister();
        File file = new File("src/main/java/resources/heroes.xml");
        try {
            heroes = persister.read(Heroes.class, path);
            return heroes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveToFile(String path, Heroes heroes) {
        Persister serializer = new Persister();
        try {
            serializer.write(heroes, new File(path));
            System.out.println("XML escrito correctamente");
            return true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonResultado = gson.toJson(heroes.getPersonajes());
        try (PrintWriter printWriter = new PrintWriter(path)) {
            printWriter.println(jsonResultado);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
 */


