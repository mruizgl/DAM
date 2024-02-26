package ies.puerto.modelo.ficheros.csv.impl;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;
import ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.File;
import java.util.List;

public class BibliotecaCsv implements IBiblioteca {
    @Override
    public BibliotecaEntity buscarBiblioteca(int id) {
        return null;
    }

    @Override
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity actualizarBiblioteca(int id) {
        return null;
    }

    @Override
    public BibliotecaEntity eliminarBiblioteca(int id) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    public boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public boolean esDirectorio(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isDirectory();
    }
}
