package es.ies.puerto.modelo.fichero.interfaces;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;

import java.util.List;

public interface IFichero {
    public List<ProductoAbstracts> read(String path, String articulo);
    public boolean reading(String path, String contenido);
}
