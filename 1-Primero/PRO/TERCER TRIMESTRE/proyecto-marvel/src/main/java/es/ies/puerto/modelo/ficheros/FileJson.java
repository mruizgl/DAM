package es.ies.puerto.modelo.ficheros;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.interfaces.IOperacionesFichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class FileJson implements IOperacionesFichero {
    @Override
    public Heroes readFromFile(String path) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type userListType = new TypeToken<ArrayList<Personaje>>(){}.getType();
        Heroes heroes = new Heroes();

        try {
            ArrayList<Personaje> personajes = gson.fromJson(new FileReader(path), userListType);
            heroes.setPersonajes(personajes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return heroes;
    }

    @Override
    public boolean saveToFile(String path, Heroes heroes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonResultado = gson.toJson(heroes.getPersonajes());
        try (PrintWriter printWriter = new PrintWriter(path)) {
            printWriter.println(jsonResultado);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
