package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.impl.Heroes;

public interface IOperacionesFichero {
    public Heroes readFromFile (String path);
    public boolean saveToFile (String path, Heroes heroes);

}
