package es.ies.puerto.modelo.ficheros;

import es.ies.puerto.modelo.impl.Heroes;
import es.ies.puerto.modelo.impl.Personaje;
import es.ies.puerto.modelo.interfaces.IOperacionesFichero;

import java.io.*;

public class FileCsv implements IOperacionesFichero {
    @Override
    public Heroes readFromFile(String path) {
        Heroes heroes = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            heroes = new Heroes();
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                Personaje personaje = new Personaje(partes[0], partes[1], partes[2], null);
               heroes.addHeroe(personaje);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return heroes;
    }



    @Override
    public boolean saveToFile(String path, Heroes heroes) {
        boolean resultado = false;
        try(PrintWriter printWriter = new PrintWriter(path)) {
            printWriter.println("nombre,alias,genero,poderes");
            for (Personaje personaje : heroes.getPersonajes()) {
                printWriter.println(personaje.getNombre() + ", " + personaje.getAlias() + ", " + personaje.getGenero());
            }
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return resultado;
    }
}
