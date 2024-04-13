package es.ies.puerto.modelo.ficheros;

import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.PersonajesList;
import es.ies.puerto.modelo.interfaces.IOperacionesFichero;
import org.simpleframework.xml.core.Persister;

import java.io.File;


public class FileXml implements IOperacionesFichero {
    @Override
    public void readFromFile(String path) {
        PersonajesList personajesList = new PersonajesList();
        Persister serializer = new Persister();
        try {
            serializer.write(personajesList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


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


